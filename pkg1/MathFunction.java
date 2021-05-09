package com.pkg1;

public class MathFunction {
	
	
	public int math(int a,int b,String opt)
	{
		switch (opt) {
		case "addition":
			return a + b;
		case "Subtraction":
			return a - b;
		case "Multiplication":
			return a * b;
		case "Division":
			return a / b;
		default:
			break;
		}
		return 0;
	}
}
