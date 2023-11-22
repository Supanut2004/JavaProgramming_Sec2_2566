import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.0");
		//input and convert weight from user
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight:"));
		//input and convert height cm. to m. from user
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height:"));
		//convert height from cm. to m.
		height = height/100;
		double bmi = weight/(height*height);
		
		//check condition and declare meaning of BMI
		String bmiCategory;
		if(bmi<18.5) bmiCategory = "Underweight";
		else if (bmi<24.9) bmiCategory = "Normal-weight";
		else if (bmi<29.9) bmiCategory = "Overweight";
		else bmiCategory = "Obesity";
		
		//display BMI value to showMessage dialog box
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.2f",bmi)
				+"\nYou're "+bmiCategory);
		
	}

}
