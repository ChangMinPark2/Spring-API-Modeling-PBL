package kr.co.grade.service;

import java.lang.reflect.Member;
import java.util.List;

public interface StudentService {
    void createStudent();
    List<String> findAllGrade();
    Member findByGrade();
}
