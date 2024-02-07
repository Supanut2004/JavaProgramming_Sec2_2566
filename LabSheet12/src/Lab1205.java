import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner (new File("d://txtFile//student.txt"));
		int i =1;
		Header();
		while(scan.hasNext()) {
			String id = scan.next();
			scan.next();
			String fname = scan.next();
			String lname = scan.next();
			double grade = scan.nextDouble();
			scan.next();
			System.out.println(i+".\t"+id+"\t"+level(id)+"\t"+fname.charAt(0)+"."+lname+"\t"+grade
					+"\t"+Status(grade));
			i++;
		}
	}
		
	public static String level(String id) {
			if (Integer.parseInt(id.substring(0,2))== 18) {
				return "4th";
			}
			else
			{
				return "3th";
			}
			
	}
	public static String Status(double grade) {
		if (grade > 2.00)
			return "PASS";
		else if (grade < 1.00)
			return "Retired";
		else return "Critical";
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tname\t\tGrade\tstatus");
		System.out.println("==============================================================");
		
		
	}

}
