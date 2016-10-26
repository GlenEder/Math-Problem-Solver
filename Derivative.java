/*
*Derivative
*
*Calculates derivative of function
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 25, 2016
*/
import javax.swing.*;

public class Derivative {
	
	public Derivative() {
		Utils util = new Utils();
		String problem = JOptionPane.showInputDialog(null, "Enter equation in Cx^n form: ");
		JOptionPane.showMessageDialog(null, "Answer: " + util.derivive(problem));
	}
	

}