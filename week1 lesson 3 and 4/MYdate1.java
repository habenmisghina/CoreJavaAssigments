package week1lesson3q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MYdate1 {
	static Date date;
	static String nameMonth;
	static int DayOfYear;
	static int year;

	public MYdate1(int year, int dayOfYear) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_YEAR, dayOfYear);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int month = cal.get(Calendar.MONTH);
		Calendar cal1 = new GregorianCalendar(year, month, day);
		date = cal1.getTime();
		this.year = year;
		DayOfYear = dayOfYear;

	}

	public MYdate1(int year, int month, int day) {
		Calendar calendar = new GregorianCalendar(year, month - 1, day);
		date = calendar.getTime();
		DayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		this.year = year;
	}

	public MYdate1(int year, int day, String nameMo) throws ParseException {

		nameMonth = nameMo + " " + day + " " + year;
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd yyyy");
		date = sdf2.parse(nameMonth);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		Calendar calendar = new GregorianCalendar(year, month, day);
		date = calendar.getTime();
		DayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		this.year = year;

	}

	public static void main(String[] args) throws ParseException {
		MYdate1 mydate1;
		System.out
				.println("Enter 1 for format: MM/DD/YYYY\nEnter 2 for format: Month DD, YYYY\nEnter 3 for format: DDD YYYY\nEnter 4 to exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your choice");
		int choice = sc.nextInt();
		System.out.println("Choice: " + choice);
		while (true) {
			if (choice == 1) {
				System.out.println("Enter Month:");
				int month = sc.nextInt();
				System.out.println("Enter Day :");
				int day = sc.nextInt();
				System.out.println("Enter Year:");
				int year = sc.nextInt();
				mydate1 = new MYdate1(year, month, day);
				mydate1.displayFormat();

			} else if (choice == 2) {
				System.out.println("Enter Month in Text:");
				String month = sc.next();
				System.out.println("Enter Day:");
				int day = sc.nextInt();
				System.out.println("Enter Year:");
				int year = sc.nextInt();
				mydate1 = new MYdate1(year, day, month);
				mydate1.displayFormat();
			} else if (choice == 3) {
				System.out.println("Enter Day Of The Year:");
				int day = sc.nextInt();
				System.out.println("Enter Year:");
				int year = sc.nextInt();
				mydate1 = new MYdate1(year, day);
				mydate1.displayFormat();
			} else if (choice == 4) {

				break;
			}
			System.out.println("Do you want to continue?  yes or no");
			String yesNO = sc.next();
			if (yesNO.equals("Yes") || yesNO.equals("YES")
					|| yesNO.equals("yes") || yesNO.equals("Y")
					|| yesNO.equals("y")) {
				System.out
						.println("Enter 1 for format: MM/DD/YYYY\nEnter 2 for format: Month DD, YYYY\nEnter 3 for format: DDD YYYY\nEnter 4 to exit");
				System.out.println("Choose your choice");
				choice = sc.nextInt();
				System.out.println("Choice: " + choice);
			} else
				break;
		}
		System.out.println("Terminated!!!");
	}

	public void displayFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM dd, yyyy");
		System.out.println("MM/dd/yyyy:" + sdf.format(date));
		System.out.println("MMMM dd,yyyy:" + sdf1.format(date));
		System.out.println("DDD yyyy:" + DayOfYear + " " + year);
	}

}
