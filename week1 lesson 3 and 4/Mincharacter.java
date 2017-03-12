package week1lesson4q1;

import java.util.Scanner;

public class Mincharacter {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter a word ");
		String wordin=input.next();
		int lowerindex=0;
		int lastindex=wordin.length()-1;
	  char i=mincharfinder(wordin,lowerindex,lastindex);
	  System.out.println("THE MINIMUM CHARACTER IS: "+i);
	  input.close();

	}
public static char mincharfinder(String str,int lowerindex,int lastindex){
	char min;
	if(lowerindex>lastindex){
		return 'z';
	}
	min=mincharfinder(str,lowerindex+1,lastindex);
	if(str.charAt(lowerindex)<min){
		return str.charAt(lowerindex);
	}
	else{
		return min;
	}
}
}
