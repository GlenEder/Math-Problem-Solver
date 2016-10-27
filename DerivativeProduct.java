/*
*Utils
*
*contains method to calculate formulas
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 26, 2016
*/
import javax.swing.*;

public class DerivativeProduct {

	public DerivativeProduct() {
		Utils util = new Utils();

		String function = (String) JOptionPane.showInputDialog(null, "Enter equation in Cx^n * Cx^n");
		function = function.replaceAll(" ", "");
		String f1 = function.substring(0, function.indexOf("*"));
		String f2 = function.substring(function.indexOf("*") + 1, function.length());

		JOptionPane.showMessageDialog(null, "f'(x) = " + util.productDerivative(f1, f2));
	}
}