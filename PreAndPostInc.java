package com.mum.fppackage;

public class PreAndPostInc {

	public static void main(String[] args) {
//		the sign of a modulus result is dependent of the left operand.
		int a=-5%2;
		System.out.println(a);
		System.out.println(Math.floorMod(-5, 2));
		 
		System.out.println("----------");
		int x=4;
		int y=++x;
		System.out.println("x is "+x+" and y is "+y);
		System.out.println("--------------");
		x=4;
		y=x++;
		System.out.println("now x is "+x+"and y is "+y);
		
		

	}

}
