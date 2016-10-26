/*
*Pythagorean Theorem
*
*Computes Pythagorean Theorem
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 25, 2016
*/
import java.lang.Math;
import javax.swing.*;

public class PythagoreanTheorem {

	public PythagoreanTheorem() {

		double a = 0;
		double b = 0;
		double c = 0;

		String[] choices = {"A", "B", "C"};
		String solveFor = (String) JOptionPane.showInputDialog(null, "Select variable to solve for: ", "Pythagorean Theorem", JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);
		
		switch(solveFor) {
			case "A":
				b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter 'B': "));
				c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter 'C': "));

				a = Math.sqrt((Math.pow(c, 2) - Math.pow(b, 2)));
				JOptionPane.showMessageDialog(null, "A equals: " + a);
				break;
			case "B":
				a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter 'A': "));
				c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter 'C': "));

				b = Math.sqrt((Math.pow(c, 2) - Math.pow(a, 2)));
				JOptionPane.showMessageDialog(null, "B equals: " + b);
				break;
			case "C": {
				a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter 'A': "));
				b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter 'B': "));

				c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
				JOptionPane.showMessageDialog(null, "C equals: " + c);
				break;
			}
		}


		
		
	




	}
}