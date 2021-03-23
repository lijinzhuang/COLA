package com.alilbaba.web;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.alibaba.cola.catchlog.CatchLogAspect;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public RspDTO handlerException(Exception e){
        return new RspDTO(500,e.getMessage()+e.getClass());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RspDTO handlerMethodArggumentNotValidException(MethodArgumentNotValidException e){
        return new RspDTO(600,e.getBindingResult().getFieldError().getField()
            + e.getBindingResult().getFieldError().getDefaultMessage());
    }
}
