package week1lesson4q1;

import java.util.Scanner;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] binarylist={20,30,47,50,60,80,90,100,120,500,568,700};
		int low=0;
		int high=binarylist.length-1;
		System.out.println("Enter a number to find its index in the array");
		int search=input.nextInt();
		int i=binarySearch(binarylist,low,high,search);
		System.out.println("the number was found at index number: "+i);
		input.close();
	}
  public static int binarySearch(int[]a,int low,int high,int number){
	  int middle;
	  int index;
	  if(low>high){
		  System.out.print("the number you entered is not in the array  ");
		  return -1;
	  }
	  else{
		  middle=(low+high)/2;
		  if(number==a[middle]){
			  index=middle;
		  }
		  else if(number<a[middle]){
			  index=binarySearch( a, low, middle-1, number);
		  }
		  else{
			  index=binarySearch(a,middle+1,high,number);
		  }
		  return index;
	  }
  }
}
