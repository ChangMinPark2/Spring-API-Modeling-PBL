package kr.co.grade.persistance.repository;

import kr.co.grade.persistance.domain.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentRepositoryImpl implements StudentRepository {
    private final static Map<Long, Student> store = new HashMap<>();
    @Override
    public void save(Student student) {
        store.put(student.getId(), student);
    }

    @Override
    public List<Student> findByGrade(int grade) {
        List<Student> studentsWithGrade = new ArrayList<>();
        for (Student student : store.values()) {
            if (student.getScore() == grade) {
                studentsWithGrade.add(student);
            }
        }

        return studentsWithGrade;
    }

    public List<Student> findAllStudent() {
        return new ArrayList<>(store.values());
    }
}
