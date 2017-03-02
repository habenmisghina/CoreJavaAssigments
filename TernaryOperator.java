package com.mum.fppackage;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your income");
		int income=input.nextInt();
		String customerStatus=(income>1000)? "Platinum": "silver";
		System.out.println("your status is :"+customerStatus);
		System.out.println("enter your age");
		int age=input.nextInt();
		String SocialSecurityStatus=(age>65)?"eligible":"illigible";
		System.out.println(SocialSecurityStatus);
		input.close();

	}

}
