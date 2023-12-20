import java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by a space.\n:");
		String Fname = scan.nextLine();
		int result = Fname.indexOf(' ');
		String Firstname = Fname.substring(0,result);
			System.out.print(abbreviatName(Fname).toUpperCase()+Firstname);
		

	}
	public static String abbreviatName(String fullname) {
		String Full = "";
	    for(int i = 0;i<fullname.length();i++) {
	    	if(fullname.charAt(i)==' '){
	    		Full = Full+fullname.charAt(i+1)+".";
	    	}
	    }
	    return Full;
	}	
}
