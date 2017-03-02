package com.mum.fppackage;

public class Prog7{
	 public static void main(String[] args){
	 int count=0;
	 for(int i=0;i<args.length;i++){
	   System.out.println(args[i].length());
	   if(args[i].startsWith("A")){
	count++;
	   
	}

	}
	 System.out.println( "count of Strings names start with \"A\"  :"+count);

	}

	}
