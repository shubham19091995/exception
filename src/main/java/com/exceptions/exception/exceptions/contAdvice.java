package com.exceptions.exception.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class contAdvice extends ResponseEntityExceptionHandler{
    @ExceptionHandler(ErrorMessage.class)
    public ResponseEntity<String> resourceNotFoundException(ErrorMessage ex,WebRequest mm) {
        return new ResponseEntity<String>("nothing is there "+ex.getMessage() + " "+
        ex.getTimestamp()+" "+ex.getStatusCode()+" webRequest "+ mm.getDescription(false) ,HttpStatus.BAD_REQUEST);
     
    }
}
