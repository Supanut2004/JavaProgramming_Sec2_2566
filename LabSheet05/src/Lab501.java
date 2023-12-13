import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		int result = fullName.indexOf(' ');
		String firstName, lastName;
		
		if(result == -1) {
			System.out.println("Incorrect Name");
		}
		else {
			firstName = fullName.substring(0,result);
			lastName = fullName.substring(result);
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Last Name: "+lastName);
			
		}

	}

}
