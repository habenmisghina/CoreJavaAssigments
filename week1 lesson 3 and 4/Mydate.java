package week1lesson3q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Mydate {
	private int year;
	private int month;
	private int day;
	private String monthstr;
	LocalDate localdate;
	SimpleDateFormat sdf;
	

	Mydate(int year, int month, int day) {
		localdate = LocalDate.of(year, month, day);

	}

	Mydate(String monthstr, int day, int year) throws ParseException {
		String nameMonth = day+ " " + monthstr  + " " + year;
		sdf=new SimpleDateFormat("dd MMMM yyyy");
		Date dt=sdf.parse(nameMonth);
		System.out.println(dt);
		Calendar cale=Calendar.getInstance();
		cale.setTime(dt);
		
		int month=cale.get(Calendar.MONTH);
		int day1=cale.get(Calendar.DAY_OF_WEEK);
		System.out.println(day1);
		localdate = LocalDate.of(year, month+1, day1);

		
	}

	Mydate(int year, int day) {
		this.day = day;
		this.year = year;

	}

	public void displayFormat() {
		SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYYY");
		SimpleDateFormat format2 = new SimpleDateFormat("MMMM dd, YYYY");
		int dayofyear = localdate.getDayOfYear();
		Instant instant = localdate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date date1 = Date.from(instant);
		int yer = localdate.getYear();
		System.out.println("MM/dd/yyyy:" + format.format(date1));
		System.out.println("MMMM dd,yyyy:" + format2.format(date1));
		System.out.println("DDDD yyyy:" + dayofyear + " " + yer);

	}

}
