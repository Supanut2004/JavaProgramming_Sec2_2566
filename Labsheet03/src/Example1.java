import javax.swing.*; //Import library for input data from Dialog box
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
	  DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//input and convert data from dialog box
		
		int numberofcustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill?"));
		
		double discount10 , totalPrice = 0;
		//calculate total price of Buffet
		totalPrice = BUFFET * numberofcustomer;
		//using showMessage dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is "
		//		+ frm.format(totalPrice) +" baht.");
		//using !!!CONFIRM DIALOG BOX!!!
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null, 
					"Total price is "+ frm.format(totalPrice)+" baht."
							+ "\nDo you have a member card?");
			
		}while(memberCard == JOptionPane.CANCEL_OPTION);
		
		
		if(memberCard == JOptionPane.YES_OPTION) {
			//discount = totalPrice - (totalPrice*10/100);
			discount10 = totalPrice * 90/100; // discount 10%
			JOptionPane.showMessageDialog(null, "Amount to be paid is "
							+ frm.format(discount10) +" baht.");
		}// end o if
		
		else if(memberCard == JOptionPane.NO_OPTION) {
			
			JOptionPane.showMessageDialog(null, "Amount to be paid is "
					+ frm.format(totalPrice) +" baht.");
			
		
			
		}
		

	}

}
