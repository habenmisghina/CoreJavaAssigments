package com.mum.fppackage;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random num=new Random();
		int randnum=num.nextInt(5);
		System.out.println(randnum);

	}

}
