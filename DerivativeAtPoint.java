/*
*Derivative At Point
*
*finds slope at given point in a function
*
*@author Glen Eder, geder@purdue.edu
*
*@version Nov 1, 2016
*/
import javax.swing.JOptionPane;

public class DerivativeAtPoint {

	public DerivativeAtPoint() {
		Utils util = new Utils();

		String function = (String) JOptionPane.showInputDialog(null, "Enter function in Cx^n form: ");
		double point = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter point to solve for: "));

		double answer = util.derivativeAtPoint(function, point);
		JOptionPane.showMessageDialog(null, "Answer: " + answer);
	}
	
}