import javax.swing.*;
import java.util.*; //use library for Random class
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		//using class Random for random money
		
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Your balance : "+frm.format(balance)+
				"\nInput money to withdraw :"));
		
		if(withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 20,000",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw%100 < 99 && withdraw%100 >1) {
			int lowerthan0 = withdraw%100 ;
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw "+ lowerthan0+" baht." ,
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else { 
			JOptionPane.showMessageDialog(null, "You withdraw "+ 
		frm.format(withdraw) + " baht."+ "\n1,000 ="+ withdraw/1000+"\n500 ="+ (withdraw%1000)/500+"\n100 = "
		+((withdraw%1000)%500)/100);
		}

	}

}
