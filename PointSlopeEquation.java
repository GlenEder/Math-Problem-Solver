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
		Utils util = new Utils();
		String point = JOptionPane.showInputDialog(null, "Enter point seperated by a comma");
		point = point.replaceAll(" ", "");

		String xValue = point.substring(0, point.indexOf(","));
		String yValue = point.substring(point.indexOf(",") + 1, point.length());

		double x = util.fractionToDouble(xValue);
		double y = util.fractionToDouble(yValue);

		double m = util.fractionToDouble(JOptionPane.showInputDialog(null, "Enter the slope: "));

		JOptionPane.showMessageDialog(null, util.pointSlopeEquation(x, y, m));
	}
	
	
}