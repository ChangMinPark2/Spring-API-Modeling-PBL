package kr.co.grade.service.model.request;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentReqDto {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CREATE {
        @NotBlank(message = "이름을 입력해 주세요.")
        private String name;

        @Max(value = 5, message = "성적은 6이상을 입력 할 수 없습니다.")
        @Min(value = 1, message = "성적은 0이하를 입력 할 수 없습니다.")
        @NotNull(message = "성적을 입력해 주세요.")
        private Integer grade;
    }
}
