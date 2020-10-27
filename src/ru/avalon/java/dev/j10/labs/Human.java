package ru.avalon.java.dev.j10.labs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Human implements Person {
	
	private String name;
	private Date birthDay;
	private String[] names = {
			"Noah", "Jacob", "Ethan", "Daniel", "Alexander", "Matthew", "Jayden",
			"Anthony", "Sebastian", "David", "Sophia", "Isabella", "Emma", "Mia",
			"Olivia", "Emily", "Sofia", "Victoria", "Abigail", "Camila"};
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
	public Human() {
		this.name = names[(int)(Math.random() * names.length)];
		//this.name = names[1];
		int year = (int) (Math.random() * 49 + 1970);
		int month = (int) (Math.random() * 12);
		int number = 0;
		switch (month) {
		case 0:
		case 2:
		case 4:
		case 6:
		case 7:
		case 9:
		case 11:
			number = 31;
			break;
		case 3:
		case 5:
		case 8:
		case 10:
			number = 30;
			break;
		case '1':
			boolean isLeapYear;
			isLeapYear = (year % 4 ==0);
			isLeapYear = isLeapYear && (year % 100 != 0);
			isLeapYear = isLeapYear || (year % 400 == 0);
			if (isLeapYear) {
				number = 29;
			} else 
				number = 28;
		}
		int day = (int) (Math.random() * number);
		Calendar date = new GregorianCalendar(year, month, day);
		this.birthDay = date.getTime();
	}
	@Override
	public int compareTo(Human o) {
		int n = getName().compareToIgnoreCase(o.getName());
		if (n > 0) {return 1;}
		if (n < 0) {return -1;}
		return birthDay.compareTo(o.birthDay);
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public Date getBirthDate() {
		return birthDay;
	}
	
	public String getFullData() {
		return name + " " + format.format(birthDay);
	}
}
