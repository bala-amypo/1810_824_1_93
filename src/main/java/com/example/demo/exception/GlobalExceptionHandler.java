package com.example.demo.exception;

import com.example.demo.dto.RequestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<RequestResponse> handleResourceNotFound(
            ResourceNotFoundException ex) {

        return new ResponseEntity<>(
                new RequestResponse(
                        HttpStatus.NOT_FOUND.value(),
                        ex.getMessage()
                ),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<RequestResponse> handleBadRequest(
            IllegalArgumentException ex) {

        return new ResponseEntity<>(
                new RequestResponse(
                        HttpStatus.BAD_REQUEST.value(),
                        ex.getMessage()
                ),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<RequestResponse> handleGeneralException(
            Exception ex) {

        return new ResponseEntity<>(
                new RequestResponse(
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        "Internal server error"
                ),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
