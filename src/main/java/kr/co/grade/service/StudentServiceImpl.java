package kr.co.grade.service;

import kr.co.grade.persistance.domain.Student;
import kr.co.grade.persistance.repository.StudentRepository;
import kr.co.grade.persistance.repository.StudentRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    @Override
    public void createStudent(String name, int grade) {
        Student student = new Student(name, grade);
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudentsByGrade(int grade) {
        return studentRepository.findByGrade(grade);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAllStudent()
                .stream()
                .sorted((o1, o2) -> o1.getScore() - o2.getScore())
                .collect(Collectors.toList());
    }
}
