package kr.co.grade.service;

import kr.co.grade.service.model.request.StudentReqDto;
import kr.co.grade.service.model.response.StudentResDto;
import java.util.List;

public interface StudentService {
    StudentResDto.READ createStudent(StudentReqDto.CREATE create);
    List<StudentResDto.READ> getAllStudentsByGrade(int grade);
    List<StudentResDto.READ> getAllStudents();
}
