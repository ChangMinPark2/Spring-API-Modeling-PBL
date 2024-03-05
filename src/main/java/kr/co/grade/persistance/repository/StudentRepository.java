package kr.co.grade.persistance.repository;

import kr.co.grade.persistance.domain.Student;
import java.util.List;

public interface StudentRepository {
    void save(Student student);

    List<Student> findAllByGrade(int grade);

    List<Student> findAllStudent();
}
