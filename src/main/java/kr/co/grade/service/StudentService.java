package kr.co.grade.service;

import kr.co.grade.service.model.request.StudentDto;
import kr.co.grade.service.model.response.StudentResDto;

import java.util.List;

public interface StudentService {
    StudentResDto.READ create(StudentDto dto);

    List<StudentResDto.READ> getAllStudentsByGrade(int grade);

    List<StudentResDto.READ> getAllStudents();
}