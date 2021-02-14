package desafio1;

public class Pessoa {
	
	private String name;
	private double height;
	private int day;
	private int month;
	private int year;
	private int currentAge = 2021;
	
	public Pessoa(String name, double height, int day, int month, int year) {
		this.name = name;
		this.height = height;
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getcurrentAge() {
		return currentAge;
	}


	public void setcurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	
	

}
