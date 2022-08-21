package com.suji.empmgnt.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.suji.empmgnt.model.ExceptionModel;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	
}
