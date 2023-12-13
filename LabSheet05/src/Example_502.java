import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//1.input mail from dialog box
		String urEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		//2.check mail start with @ or space bar or not
		while(urEmail.startsWith("@")||urEmail.startsWith(" ")) {
			urEmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
		}
		//3.check mail end with hotmail.com or gmail.com or not
		urEmail = urEmail.toLowerCase();  
		if(urEmail.endsWith("gmail.com")||urEmail.endsWith("hotmail.com")) {
			JOptionPane.showMessageDialog(null,"Yor e-mail is " + urEmail);
		}
		else {
			JOptionPane.showMessageDialog(null,
					"Your e-mail is not hotmail or gmail dot com");
		}
		
		
	}

}
