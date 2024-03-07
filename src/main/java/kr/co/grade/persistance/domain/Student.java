package kr.co.grade.persistance.domain;

import kr.co.grade.service.model.response.StudentResDto;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class Student {
    private static Long idCounter = 0L;
    private final Long id;
    private final String name;
    private final int grade;

    private Student(String name, int grade) {
        this.id = ++idCounter;
        this.name = name;
        this.grade = grade;
    }

    public static Student create(String name, int grade) {
        return new Student(name, grade);
    }

    public static StudentResDto.READ toReadAll(Student student) {
        return StudentResDto.READ.builder()
                .name(student.getName())
                .grade(student.grade)
                .build();
    }
}
