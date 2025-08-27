package com.course.exception;

public class ActionException extends Exception {

	String errorMessage;
	
	public ActionException(String errorMessage, Throwable cause) {
		super(cause);
		this.errorMessage = errorMessage;
	}
	
}
