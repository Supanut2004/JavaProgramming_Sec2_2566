import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input Email: ");
		String email = input.nextLine();
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		//String tmp = "";
		boolean check = false;
		while(readFile.hasNext()) {
		//String[] data = tmp.split("\t");
		
			String password = readFile.next();
			String Email = readFile.next().toUpperCase();
				if(Email.equalsIgnoreCase(email)) {
					System.out.println("Your password is "+password);
					check = true;
					if(check) {
						break;
					}
				}
					else {
						check=false;
					}
				}
		if(check == false) {
			System.out.print("That data not found ....");
			}
			
		readFile.close();
		
	}

}
