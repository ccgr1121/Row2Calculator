package com.qa.calculator;

public class Calculator {

	public Calculator() {
		
		
	}
	
	public double Divide(double num1, double num2) {
		if (num2 != 0) {
			return num1/num2;
		}else {
			throw new DivisionByZeroException();
		}
	}
	
}
