package com.indatacore.demo.controller.exceptions;

import com.indatacore.demo.exceptions.CsvRowNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandlingController {

    @ExceptionHandler(CsvRowNotFoundException.class)
    public ResponseEntity<String> handleCsvRowNotFoundException(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), null, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAnyOtherException(Exception ex, WebRequest request) {
        return new ResponseEntity<>("Something went wrong", null, HttpStatus.BAD_REQUEST);
    }

}