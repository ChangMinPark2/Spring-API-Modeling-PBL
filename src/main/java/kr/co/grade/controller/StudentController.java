package kr.co.grade.controller;

import jakarta.validation.Valid;
import kr.co.grade.infra.model.ApiResponse;
import kr.co.grade.service.StudentService;
import kr.co.grade.service.model.request.StudentReqDto;
import kr.co.grade.service.model.response.StudentResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ApiResponse<StudentResDto.READ> createStudent(@Valid @RequestBody StudentReqDto.CREATE create) {
        return ApiResponse.makeResponse(List.of(studentService.createStudent(create)));
    }

    @GetMapping("/grade")
    public ApiResponse<StudentResDto.READ> getAllStudentsByGrade(@RequestParam("grade") int grade) {
        return ApiResponse.makeResponse(studentService.getAllStudentsByGrade(grade));
    }

    @GetMapping
    public ApiResponse<StudentResDto.READ> getAllStudents() {
        return ApiResponse.makeResponse(studentService.getAllStudents());
    }
}
