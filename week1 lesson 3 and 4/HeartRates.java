package week1lesson3q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import week1lesson3q2.AgeCalculator;

public class HeartRates {
	private String firstname;
	private String lastname;
	private LocalDate dob;
	private static final int RESTING_HEART_RATE = 70;
	private static final double LOWER_BOUNDRY = 0.5;
	private static final double UPPER_BOUNDRY = 0.85;
	private String targetHeartRate;
	private int maxHeartRate;
	private String format;

	HeartRates(String firstname, String lastname, int year, int month, int day) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = LocalDate.of(year, month, day);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("LLLL/dd/yyyy");
		format = this.dob.format(dtf);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String firstname = input.next();
		System.out.println("Please enter your last name");
		String lastname = input.next();
		System.out.println("Please enter your birth year");
		int year = input.nextInt();
		System.out.println("Please enter of birth month in digits");
		int month = input.nextInt();
		System.out.println("Please enter of birth date");
		int day = input.nextInt();
		HeartRates heartratecal = new HeartRates(firstname, lastname, year,
				month, day);
		heartratecal.targetHeartRate();
		System.out.println(heartratecal);
		input.close();
	}

	public int getAge() {
		AgeCalculator agecal = new AgeCalculator();
		Period age = agecal.calculateAge(dob);
		return age.getYears();
	}

	public int maxHeartRate() {
		maxHeartRate = 220 - this.getAge();
		return maxHeartRate;
	}

	public void targetHeartRate() {
		int averageHeartRate = this.maxHeartRate() - RESTING_HEART_RATE;
		double lowerBoundryTargetHeartRate = averageHeartRate * LOWER_BOUNDRY
				+ RESTING_HEART_RATE;
		double upperBoundryTargetHeartRate = averageHeartRate * UPPER_BOUNDRY
				+ RESTING_HEART_RATE;
		this.targetHeartRate = lowerBoundryTargetHeartRate + "-"
				+ upperBoundryTargetHeartRate;

		System.out.println("your Target Heart Rate is between "
				+ lowerBoundryTargetHeartRate + " and "
				+ upperBoundryTargetHeartRate);
	}

	public String toString() {
		return "[ first name : " + this.firstname + " , last name:"
				+ this.lastname + " ,date of birth:" + this.format + " ,age: "
				+ this.getAge() + " ,Maximum Heart Rate:" + this.maxHeartRate()
				+ " and target heat rate range is :" + this.targetHeartRate;
	}

}
