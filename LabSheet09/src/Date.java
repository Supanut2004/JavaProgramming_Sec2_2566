
public class Date {
	private int year;
	private int month;
	private int day;
	
	Date(int year,int month ,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	//return a String in form "MM/DD/YYYY" with leading zero
	public String toString() {
		//use built-in function String.format() to form a formatted String
		//Specifier "0" to print leading zero 01/02/2024
		return String.format("%02d/%02d/%4d",month,day,year);
	}
	//set year, month , day
	public void setDate(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	

}
