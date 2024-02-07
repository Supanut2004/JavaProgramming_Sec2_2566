import java.util.Scanner;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();//Name
			String lname = readFile.next();//Surname
			readFile.next();
			String email = readFile.next().toUpperCase();//email
			
			System.out.println(lname.charAt(0)+"."+fname+" "+"("+email+")");
		}
		readFile.close();

	}

}
