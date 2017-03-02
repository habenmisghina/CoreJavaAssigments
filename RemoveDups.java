package com.mum.fppackage;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 6 animal names,duplicate name is allowed");
		 for (int i = 0; i < 6; i++) {
			 list.add(input.next());
		}
		 System.out.print(list);
		 System.out.println("");
		 ArrayList<String> noDuplicate=new ArrayList<String>();
		  for (String string : list) {
			  boolean flag=false;
			for (String str : noDuplicate) {
				if(string.equals(str)){
					 flag=true;
				}
			}
			if(!flag){
				noDuplicate.add(string);
			}
		}
    System.out.println(noDuplicate);
  input.close();
	}
   
	}


