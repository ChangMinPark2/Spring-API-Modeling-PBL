package kr.co.grade.infra.exception;

import kr.co.grade.infra.model.ErrorCode;

public class NotFoundByGrapeException extends BusinessException {
    public NotFoundByGrapeException (ErrorCode errorCode){
        super(errorCode);
    }

}
