package kr.co.grade.persistance.repository;

import kr.co.grade.persistance.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    void save(Student student);

    List<Student> findByGrade(int grade);

    List<Student> findAllStudent();
}
