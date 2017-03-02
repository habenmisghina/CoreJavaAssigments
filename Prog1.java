package com.mum.fppackage;

public class Prog1 {

	public static void main(String[] args) {
		// RandomNumbers is in the same package and public it is visible from
		// here
		int randomnumber = RandomNumbers.getRandomInt(1, 9);
		double result = Math.pow(Math.PI, randomnumber);
		System.out.println(result);
		System.out.println("-------------------**-----------**");
		int randomnum3_14 = RandomNumbers.getRandomInt(3, 14);
		double res = Math.pow(Math.PI, randomnum3_14);
		System.out.println(res);
	}

}
