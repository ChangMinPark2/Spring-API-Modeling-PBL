package kr.co.grade.infra.exception;

import kr.co.grade.infra.model.ErrorCode;

public class NotFoundException extends BusinessException{
    public NotFoundException(ErrorCode errorCode){
        super(errorCode);
    }
}
