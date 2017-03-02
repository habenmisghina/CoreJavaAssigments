package com.mum.fppackage;

public class Formating {

	public static void main(String[] args) {
		int[][] randomArr = new int[4][4];
		String separator = "_______";
		for (int i = 0; i < randomArr.length; i++) {
			for (int j = 0; j < randomArr.length; j++) {
				randomArr[i][j] = RandomNumbers.getRandomInt(1, 100);
				 if(i==1 || i==3){
					 System.out.printf("%+,-15d", randomArr[i][j]);
				 }
				 else{
					 System.out.printf("%-15d", randomArr[i][j]);
				 }
				 
			}
			System.out.printf("%n");
			if(i==1 || i==3){
				 System.out.printf("%-14s%-16s%-15s%-15s", separator,separator,separator,separator);
			 }
			
			if(i==1)System.out.printf("%n%n%n%n");
			else System.out.printf("%n");
			
			 }
			
		}

	}


