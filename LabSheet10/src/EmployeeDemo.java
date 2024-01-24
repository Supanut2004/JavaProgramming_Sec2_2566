import java.util.*;
import java.text.DecimalFormat;
public class EmployeeDemo {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input employee id     : ");
		String id = scan.nextLine();
		System.out.print("Input employee name   : ");
		String name = scan.nextLine();
		System.out.print("Input employee salary : ");
		double salary = scan.nextDouble();
		System.out.print("Input employee sales  : ");
		double sales = scan.nextDouble();
		
		Sales empSale = new Sales(id,name,salary,sales);
		System.out.println();
		System.out.println(empSale);
		System.out.println("Total salary "+frm.format(empSale.getCommission()+empSale.getSalary()));
 
	}
 
}