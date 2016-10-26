/*
*Math Solver
*
*Solves math equations
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 25, 2016
*/
import javax.swing.*;

public class MathSolver {

	public static void main(String[] args) {

		String[] choices = {"Quadratic Formula", "Pythagorean Theorem", "Point Slope Equation", "Derivative: Quotient Rule"};

		while(true) {
		
			String input = (String) JOptionPane.showInputDialog(null, "Choose Formula: ", "Math Solver", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			
			if(input == null) {
				System.exit(0);
			}

			switch (input) {
				case "Quadratic Formula":
					Quadratic q = new Quadratic();
					break;
				case "Pythagorean Theorem":
					PythagoreanTheorem pt = new PythagoreanTheorem();
					break;
				case "Point Slope Equation":
					PointSlopeEquation pse = new PointSlopeEquation();
					break;
				case "Derivative: Quotient Rule":
					DerivativeQuotient dq = new DerivativeQuotient();
					break;
				default:
					System.exit(0);
			}
		}
	}
}