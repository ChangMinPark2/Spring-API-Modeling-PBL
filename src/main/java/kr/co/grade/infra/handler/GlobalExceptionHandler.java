package kr.co.grade.infra.handler;

import kr.co.grade.infra.exception.NotFoundException;
import kr.co.grade.infra.model.ApiResponse;
import kr.co.grade.infra.model.Status;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    protected ApiResponse<Object> handleNotFoundException(NotFoundException e) {
        Status status = new Status(e.getErrorCode());

        return ApiResponse.error(status);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ApiResponse<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        String errorMessage = fieldErrors.get(0).getDefaultMessage();
        Status status = new Status(HttpStatus.BAD_REQUEST.value(), errorMessage);

        return ApiResponse.error(status);
    }
}
