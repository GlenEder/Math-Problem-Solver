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

		Utils util = new Utils();


		String[] choices = {"A", "B", "C"};
		String solveFor = (String) JOptionPane.showInputDialog(null, "Select variable to solve for: ", "Pythagorean Theorem", JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);

		double x = 0;
		double y = 0;

		//check for cancel
		if(solveFor == null) {
			return;
		}

		switch (solveFor) {
			case "A":
				x = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter B: "));
				y = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter C: "));
				JOptionPane.showMessageDialog(null, "A: " + util.pythagoreanTheorem(x, y, 'a'));
				break;
			case "B":
				x = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter A: "));
				y = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter C: "));
				JOptionPane.showMessageDialog(null, "B: " + util.pythagoreanTheorem(x, y, 'b'));
				break;
			case "C":
				x = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter A: "));
				y = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter B: "));
				JOptionPane.showMessageDialog(null, "C: " + util.pythagoreanTheorem(x, y, 'c'));
				break;
			default:
				break;


		}
		


		
		
	




	}
}