package com.lach.weatherApp.apiErrorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler
{
    private final String INCORRECT_REQUEST = "INCORRECT_REQUEST";
    private final String BAD_REQUEST = "BAD_REQUEST";
    private final String METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED";

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<ErrorResponse> handleUserNotFoundException
            (NotFoundException ex, WebRequest request)
    {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(INCORRECT_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ErrorResponse> handleInvalidTraceIdException
            (BadRequestException ex, WebRequest request)
    {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(BAD_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodNotAllowed.class)
    public final ResponseEntity<ErrorResponse>handleMethodNotAllowed
            (MethodNotAllowed ex, WebRequest request)
    {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(METHOD_NOT_ALLOWED, details);
        return new ResponseEntity<>(error, HttpStatus.METHOD_NOT_ALLOWED);
    }
}