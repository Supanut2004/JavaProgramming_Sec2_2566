import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentId,sub_Id;
	static int subjectId;
	
	public static void main(String[] args) {
		inputStudent();

	}//end main()
	
	public static void inputStudent() {
		do{
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
			//convert sunjectId from Integer to string (sub_Id)
			sub_Id = subjectId+"";
			
		}while(!(isLength(studentId,sub_Id)));
		System.out.println();
		displayData(isITstudent(studentId),isITsubject(sub_Id));
		
	}//end inputStudent()
	
	public static boolean isLength(String id,String subId) {
		if(id.length()==10 && subId.length()==7) {
			return true;
		}
		else return false;
		
	}//end isLength()
	
	public static boolean isITstudent(String id) {
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) {
			return true;
			
		}
		else {
			return false;
		}
		
	}//end isITstudent()
	
	public static boolean isITsubject(String subId) {
		if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) {
			return true;
		}
		return false;
	}
	
	public static void displayData(boolean id,boolean subId) {
		if(id) {
			System.out.println("Student id: "+ studentId+ " 1st year student in IT");
		}
		else {
			System.out.println("Student id: "+studentId+ " is not 1st year in IT");
		}
		if(subId) {
			System.out.println("Enroll in course for Year 1");
		}
		else {
			System.out.println("Not enroll in courses for Year 1");
		}
		
	}

}
