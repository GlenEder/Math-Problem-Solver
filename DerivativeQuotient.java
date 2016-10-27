/*
*Quadratic
*
*Solves Quadratic formula
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 26, 2016
*/
import javax.swing.*;

public class DerivativeQuotient {

	public DerivativeQuotient() {

		Utils util = new Utils();
		String function = JOptionPane.showInputDialog(null, "Enter function in Cx^n % Cx^n");
		function = function.replaceAll(" ", "");
		String f1 = function.substring(0, function.indexOf("%"));
		String f2 = function.substring(function.indexOf("%") + 1, function.length());

		JOptionPane.showMessageDialog(null, "f'(x) = " + util.quotientDerivative(f1, f2));
	}
}