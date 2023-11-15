import java.util.*; //1. import library for input data from keyboard
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.define object for Scanner Class
		Scanner console = new Scanner(System.in);
		//3.Display text and input data 
		System.out.print("Input product name   : ");
		String productName = console.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = console.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = console.nextFloat();
		System.out.println(); //เว้นบรรทัด
		
		double totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		double Vat7 = totalPrice +(totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(Vat7)+" baht.");

	}

}
