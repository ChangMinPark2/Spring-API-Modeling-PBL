package kr.co.grade.infra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Status {
    private int code;
    private String message;

    public Status(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public Status(int statusCode, String statusMessage) {
        this.code = statusCode;
        this.message = statusMessage;
    }
}
