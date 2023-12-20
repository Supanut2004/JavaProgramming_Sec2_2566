import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}//end main()
	
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		//inputEmail =inputEmail.toLowerCase();
		
		boolean chkEmail = checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
		
	}//end inputEmail()
	
	public static boolean checkEmail(String Email) {
		if(Email.endsWith("hotmail.com")||Email.endsWith("gmail.com")) {
			return true;
			
		}
		else	return false;
		
		//return false;
		
	}//end checkEmail()
	
	public static void displayEmail(boolean chEmail,String InpEmail) {
		if(chEmail) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+InpEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail");
		}
	}
}
