package kr.co.grade.persistance.repository;

import kr.co.grade.persistance.domain.Student;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final static Map<Long, Student> store = new HashMap<>();
    @Override
    public void save(Student student) {
        store.put(student.getId(), student);
    }

    @Override
    public List<Student> findAllByGrade(int grade) {
        return store.values().stream()
                .filter(s -> s.getGrade() == grade)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> findAllStudent() {
        return new ArrayList<>(store.values());
    }
}
