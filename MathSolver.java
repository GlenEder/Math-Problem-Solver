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

		String[] choices = {"Quadratic Formula", "Distance Formula(3D)", "Pythagorean Theorem", 
							"Point Slope Equation", "Derivative Single Function", "Derivative Product Rule",
							 "Derivative Quotient Rule", "Derivative At Point", "Find Angle Given Two Vectors(3d)"};

		while(true) {
		
			String input = (String) JOptionPane.showInputDialog(null, "Choose Formula: ", "Math Solver", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			
			//check for cancel
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
				case "Derivative Single Function":
					Derivative d = new Derivative();
				case "Derivative Product Rule":
					DerivativeProduct dp = new DerivativeProduct();
					break;
				case "Derivative Quotient Rule":
					DerivativeQuotient dq = new DerivativeQuotient();
					break;
				case "Derivative At Point":
					DerivativeAtPoint dap = new DerivativeAtPoint();
					break;
				case "Distance Formula(3D)":
					DistanceFormula3d dfThree = new DistanceFormula3d();
					break;
				case "Find Angle Given Two Vectors(3d)":
					AngleTwoVectors3d angleV = new AngleTwoVectors3d();
					break;
				default:
					System.exit(0);
			}
		}
	}
}