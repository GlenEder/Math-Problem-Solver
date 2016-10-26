/*
*Utils
*
*contains method to calculate formulas
*
*@author Glen Eder, geder@purdue.edu
*
*@version Oct 25, 2016
*/
import java.lang.Math;

public class Utils {
	
	public Utils() {
		
	}
	
	
	/*
	*calculates the derivative of the given function
	*
	*@param function -- function to be derivied
	*
	*@return solution -- derivied function
	*/
	public String derivive(String function) {
		//Cx^n
		double n;
		double C; 
		try {
			C = Double.parseDouble(function.substring(0, function.indexOf("x")));
		}catch (Exception e) {
			C = 1;
		}
		try{
			n = Double.parseDouble(function.substring(function.indexOf("^") + 1, function.length()));
		}catch (Exception e) {
			n = 1;
		}
		
		C = C * n;
		n--;
		
		String solution;
		if(n != 0) {
			solution = C + "x^" + n;
		}else {
			solution = "" + C;
		}
		
		return solution;
	}
	
	/*
	*computes a function given a point and slope
	*
	*@param x -- x value
	*@param y -- y value
	*@param slope -- slope of function
	*
	*@return equation --  equation of function
	*/
	public String pointSlopeEquation(double x, double y, double slope) {
		
		//y = m(x - x1) + y1
		double yInter = (slope * x) + y;
		String equation = "y = " + slope + "x+(" + yInter + ")";
		return equation;
	}
	
	/*
	*converts a fraction to a decimal
	*
	*@param fraction -- fraction to be converted
	*
	*@return decimal -- converted fraction
	*/
	public double fractionToDouble(String fraction) {
		double decimal = 0;
		if(fraction.contains("/")) {
			String[] parts = fraction.split("/");
			decimal = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
		}else {
			decimal = Double.parseDouble(fraction);
		}

		return decimal;
	}

	/*
	*computes the pythagorean theorem 
	*c^2 = a^2 + b^2
	*
	*@param i -- side of triangle
	*@param j -- side of triangle
	*@param solveFor -- side to solve for
	*
	*@return double -- solved side of triangle
	*/
	public double pythagoreanTheorem(double i, double j, char solveFor) {

		if(solveFor == 'a' || solveFor == 'b') {
			return Math.sqrt((Math.pow(j, 2) - Math.pow(i, 2)));
		}else {
			return Math.sqrt((Math.pow(i, 2) + Math.pow(j, 2)));
		}
	}

	
}