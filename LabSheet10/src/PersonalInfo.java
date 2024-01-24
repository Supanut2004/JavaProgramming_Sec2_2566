
public class PersonalInfo {
	private Person name; //object name reference class Person
	private Date bDay; //object bDay reference class Date
	//declare 1 private attributes
	private int personID;
	
	//default constructor
	//Postcondition : firstName = "", lastName = ""
	//dMonth = 1, dDay = 1, dYear = 1900
	//personID = 0
	PersonalInfo(){
		name = new Person();
		bDay = new Date();
		personID = 0;
	}

	//constructor with parameter
	PersonalInfo(String first,String last, int month, int day, int year, int ID ){
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	public void setPersonalInfo(String first,String last, int month, int day, int year, int ID ){
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	public String toString() {
		return "Name: "+name.toString() +"\n"
	+"Date of Birth: " +bDay.toString()+"\n"+"Personal ID: "+personID;
	}
}
