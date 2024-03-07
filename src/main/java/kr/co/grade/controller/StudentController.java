package kr.co.grade.controller;

import jakarta.validation.Valid;
import kr.co.grade.infra.model.ApiResponse;
import kr.co.grade.service.StudentService;
import kr.co.grade.service.model.request.StudentDto;
import kr.co.grade.service.model.response.StudentResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static kr.co.grade.infra.model.ApiResponse.makeResponse;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ApiResponse<StudentResDto.READ> create(@Valid @RequestBody StudentDto dto) {
        return makeResponse(List.of(studentService.create(dto)));
    }

    @GetMapping("/grade")
    public ApiResponse<StudentResDto.READ> getAllStudentsByGrade(@RequestParam("grade") int grade) {
        return makeResponse(studentService.getAllStudentsByGrade(grade));
    }

    @GetMapping
    public ApiResponse<StudentResDto.READ> getAllStudents() {
        return makeResponse(studentService.getAllStudents());
    }
}
