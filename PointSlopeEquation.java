/*
*Point Slope Equation
*
*Generates function of a line given a point and slope
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 25, 2016
*/
import javax.swing.*;

public class PointSlopeEquation {

	public PointSlopeEquation() {
		String point = JOptionPane.showInputDialog(null, "Enter point seperated by a comma");
		point = point.replaceAll(" ", "");

		String xValue = point.substring(0, point.indexOf(","));
		String yValue = point.substring(point.indexOf(",") + 1, point.length());

		double x = Double.parseDouble(xValue);
		double y = Double.parseDouble(yValue);

		double m = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the slope: "));

		double yInter = (m * x) + y;
		// y = m(x - x1) + y1

		JOptionPane.showMessageDialog(null, "y = " + m + "x+(" + yInter + ")");
	}
}