package kr.co.grade.service.model.response;

import kr.co.grade.persistance.domain.Student;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentResDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class READ {
        private String name;
        private int grade;
    }

    public static StudentResDto.READ toReadAll(Student student) {
        return StudentResDto.READ.builder()
                .name(student.getName())
                .grade(student.getGrade())
                .build();
    }
}
