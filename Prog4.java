package com.mum.fppackage;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		String wordToReverse = input.next();
	
		for (int j = wordToReverse.length() - 1; j >= 0; j--) {
			System.out.print( wordToReverse.charAt(j));
		}
	
		input.close();
	}
}
