import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		//create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		//create object for write data to file using PrintStream Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		do {
			header(); // call header method from Employee
			System.out.print("Enter name: ");
			name =	scan.next();
			System.out.print("Enter department: ");
			dept = scan.next();
			//save all data to file
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = scan.next().toLowerCase();
		}while(answer.equals("y"));
	}
	public void read() {
		try {
			//create object for read File using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			int i = 1;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+") "+name);
					i++;
					check=true;
				}
			}
			header();
			if (check==true) {
				System.out.print("\nEmployee in department "+super.getDept()+" is "+ (i-1) +" person.");
			}
			else if(check==false) {
				System.out.print("\nSorry, no department: "+super.getDept()+" in File.");
			}
			
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}
}
