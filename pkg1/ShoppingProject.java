package com.pkg1;

import java.util.Scanner;

public class ShoppingProject {
	static Scanner s = new Scanner(System.in);
	static ShoppingProject sp = new ShoppingProject();
	//double dis, Oamount, Ramt;
	int price = 200;

	public static void main(String[] args) {
		// ShoppingProject sp = new ShoppingProject();

		System.out.println("Welcome to Online shopping");
		System.out.print("enter your selected number ");
		System.out.println("slect menu");
		System.out.println("1.Electronics");
		System.out.println("2.Beauty");
		System.out.println("3.HouseHold");
		System.out.println("4.Clothing");
		System.out.println("5.Toys");
		int a = s.nextInt();
		
		System.out.println("Selected option is " + '\n' + a);

		if (a >= 6 || a == 0) {
			System.out.println("Please select valid option");
			return;
		}

		System.out.println("Select no of discount ");
		System.out.println("1.you have selected 5%");
		System.out.println("2.you have selected 10%");
		System.out.println("3.you have selected 25%");
		

		int d = s.nextInt();
		System.out.println("Selected option is " + '\n' + d);

		switch (d) {
		case 1:
			sp.FiveDiscount();
			break;

		case 2:
			sp.TenDiscount();
			break;

		case 3:
			sp.FifteenDiscount();
			break;

		default:
			System.out.println("your final price will " +  sp.price);
			break;
		}

	}

	public void FiveDiscount() {
		//dis = 5; // 200...200*5%100= remaining
		calculateDiscount(5);

	}

	public void TenDiscount() {
		//dis = 10;
		calculateDiscount(10);

	}

	public void FifteenDiscount() {
		//dis = 25;
		calculateDiscount(25);

	}

	public void calculateDiscount(int dis) {
		int Oamount = (price * dis) / 100;
		System.out.println(Oamount);
		int Ramt = price - Oamount;
		System.out.println("amount after discount is" + Ramt);
	}

}
