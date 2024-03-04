package kr.co.grade.service;

import kr.co.grade.persistance.domain.Student;

import java.lang.reflect.Member;
import java.util.List;

public interface StudentService {
    void createStudent(String name, int grade);
    List<Student> getAllStudentsByGrade(int grade);
    List<Student> getAllStudents();
}
