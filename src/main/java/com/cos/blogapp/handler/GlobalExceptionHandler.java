package com.cos.blogapp.handler;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

    @ControllerAdvice
    public class GlobalExceptionHandler {

	@ExceptionHandler(value = NoSuchElementException.class)
	public String error1(NoSuchElementException e) {
		System.out.println("터졌다:"+e.getMessage());
		return"ㅇㄴ";
	}
}
