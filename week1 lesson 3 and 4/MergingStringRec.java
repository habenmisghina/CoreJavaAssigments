package week1lesson4q1;

import java.util.Scanner;

public class MergingStringRec {

	public static void main(String[] args) {
		StringBuilder mergeresult=new StringBuilder();
		Scanner input=new Scanner(System.in);
	   System.out.println("Enter first sorted word to be merged");
	   String str1=input.next();
	   System.out.println("Enter secod sorted word to be merged");
	   String str2=input.next();
	  System.out.println( mergeWords(str1,str2,mergeresult));
	   
    input.close();
	}
	public static StringBuilder  mergeWords(String str1,String str2,StringBuilder mergeresult){
	
	 if(str1.length()==0 && str2.length()==0){
		 return mergeresult;
	 }
	  if(str1.length()==0){
		 mergeresult.append(str2);
		 return mergeresult;
	 }
	  if(str2.length()==0){
		 mergeresult.append(str1);
		 return mergeresult;
	 }
	 else if (str1.charAt(0) <= str2.charAt(0)) {
			mergeresult.append(str1.charAt(0));
			 mergeWords(str1.substring(1),str2,mergeresult);
			
		}
	 else {
			mergeresult.append(str2.charAt(0));
			mergeWords(str1, str2.substring(1),mergeresult);
			
}
	return mergeresult;
	}

}
