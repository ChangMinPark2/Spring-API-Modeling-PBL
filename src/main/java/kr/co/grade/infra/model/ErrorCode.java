package kr.co.grade.infra.model;

public enum ErrorCode {
    SUCCESS_VALUE(200, "ok"),

    NOT_FOUND(404, "학생이 존재하지 않습니다."),
    NOT_FOUND_BY_GRADE(404, "해당 성적에 맞는 학생은 없습니다.");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

