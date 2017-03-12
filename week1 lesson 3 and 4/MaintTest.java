package week1lesson3q4;

import java.util.Scanner;

public class MaintTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		String choice = input.next();
		
			if (choice.equalsIgnoreCase("C")) {
				System.out.println("Enter the Radius for Circle");
				double radius = input.nextDouble();
				Circle circle = new Circle(radius);
				System.out.printf("The area of the circle is : %.2f \n",
						circle.computeArea());
				
			}
			if (choice.equalsIgnoreCase("R")) {
				System.out.println("Enter the Width of the Rectangle");
				double width = input.nextDouble();
				System.out.println("Enter the Height of the Rectangle");
				double height = input.nextDouble();
				Rectangle rectangle = new Rectangle(height, width);
				System.out.printf("The area of the Rectangle is : %.2f \n",
						rectangle.computeArea());
			}
			if (choice.equalsIgnoreCase("T")) {
				System.out.println("Enter the  Base of the Triangle");
				double base = input.nextDouble();
				System.out.println("Enter the Height of the Triangle");
				double height = input.nextDouble();
				Triangle triangle = new Triangle(height, base);
				System.out.printf("The area of the Triangle is : %.2f \n ",
						triangle.computeArea());
			
			}
			System.out.println("Enter n to terminate");
			String check=input.next();
			if(check.equalsIgnoreCase("n")){
				break;
			}
			
		}
		System.out.println("Terminated!");

	}

}
