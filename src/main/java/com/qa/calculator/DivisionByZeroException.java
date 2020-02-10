package com.qa.calculator;

public class DivisionByZeroException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "You can't divide by 0";
	}

}
