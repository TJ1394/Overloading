package com.pkg1;

import java.util.Scanner;

public class ExtendedClass {
	
	public static void main(String[] args) {
		String str = "Division";
		Scanner s = new Scanner(System.in);
		System.out.println("enter first num");
		int num1 = s.nextInt();
		System.out.println("enter Second num");
		int num2 = s.nextInt();
		MathFunction obj = new MathFunction();
		
		int j = obj.math(num1, num2,str);
		
		System.out.println(str+ " is " + j);
	}
}
