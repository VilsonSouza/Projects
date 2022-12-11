package com.eumemu.gameawards.controller;

import com.eumemu.gameawards.service.exception.BusinessException;
import com.eumemu.gameawards.service.exception.NoContentException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public abstract class BaseRestController {
    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<Void> handlerNoContent(NoContentException exception){
        return ResponseEntity.noContent().build();


    }
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorDTO> handlerNoContent(BusinessException exception){
        ErrorDTO error = new ErrorDTO(exception.getMessage());
        return ResponseEntity.badRequest().body(error);


    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ErrorDTO> handlerUnexpectedException(Throwable exception){
        ErrorDTO error = new ErrorDTO("Ops, ocorreu um erro inesperado");
        return ResponseEntity.internalServerError().body(error);


    }
}
