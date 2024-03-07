package kr.co.grade.service;

import kr.co.grade.infra.exception.NotFoundException;
import kr.co.grade.infra.model.ErrorCode;
import kr.co.grade.persistance.domain.Student;
import kr.co.grade.persistance.repository.StudentRepository;
import kr.co.grade.service.model.request.StudentDto;
import kr.co.grade.service.model.response.StudentResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentResDto.READ create(StudentDto dto) {
        Student student = Student.create(dto.name(), dto.grade());
        studentRepository.save(student);

        return Student.toReadAll(student);
    }

    @Override
    public List<StudentResDto.READ> getAllStudentsByGrade(int grade) {
        List<Student> students = studentRepository.findAllByGrade(grade);
        checkNotFoundByGrade(students);

        return students.stream()
                .map(Student::toReadAll)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentResDto.READ> getAllStudents() {
        List<Student> students = studentRepository.findAllStudent();
        checkNotFound(students);

        return students.stream()
                .map(Student::toReadAll)
                .sorted(Comparator.comparingInt(StudentResDto.READ::getGrade))
                .collect(Collectors.toList());
    }

    private static void checkNotFound(List<Student> students) {
        if (students.isEmpty()) {
            throw new NotFoundException(ErrorCode.NOT_FOUND);
        }
    }

    private static void checkNotFoundByGrade(List<Student> students) {
        if (students.isEmpty()) {
            throw new NotFoundException(ErrorCode.NOT_FOUND_BY_GRADE);
        }
    }
}
