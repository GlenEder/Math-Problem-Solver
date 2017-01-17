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

		if(!function.contains("x")) {
			return "0.0";
		}

		try {
			C = fractionToDouble(function.substring(0, function.indexOf("x")));
		}catch (Exception e) {
			C = 1;
		}
		try{
			n = fractionToDouble(function.substring(function.indexOf("^") + 1, function.length()));
		}catch (Exception e) {
			n = 1;
		}
		
		C = C * n;
		n--;
		
		String solution;
		if(n != 0) {
			solution = C + "x^" + n;
		}else{
			solution = "" + C;
		}
		
		return solution;
	}

	/*
	*calculates the derivative at the given point in a function
	*
	*@param function -- function to be derivied
	*@param point -- point at which to find derivative
	*
	*@return answer -- slope at point
	*/
	public double derivativeAtPoint(String function, double point) {
		
		String der = derivive(function);
		if(!der.contains("x")) {
			return Double.parseDouble(der);
		}
		double c = Double.parseDouble(der.substring(0, der.indexOf("x")));
		double n = Double.parseDouble(der.substring(der.indexOf("^") + 1, der.length()));

		double answer = c * (Math.pow(point, n));
		return answer;
	}


	/*
	*computes product rule of derivatives
	*
	*@param f1 -- first part of equation
	*@param f2 -- second part of equation
	*
	*@return product -- solution of product rule
	*/
	public String productDerivative(String f1, String f2) {
		String f1d = derivive(f1);
		String f2d = derivive(f2);

		f1 = formatExpoentFunction(f1);
		f2 = formatExpoentFunction(f2);

		String product = "(" + f1 + ")(" + f2d + ") + (" + f1d + ")(" + f2 + ")";
		return product;
	}

	/*
	*computes quotient rule of derivatives
	*
	*@param f1 -- first part of equation
	*@param f2 -- second part of equation
	*
	*@return product -- solution of quotient rule
	*/
	public String quotientDerivative(String f1, String f2) {
		String f1d = derivive(f1);
		String f2d = derivive(f2);

		f1 = formatExpoentFunction(f1);
		f2 = formatExpoentFunction(f2);

		String quotient = "((" + f2 + ")(" + f1d + ") - (" + f2d + ")(" + f1 + ")) / (" + f2 + ")^2";
		return quotient;
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

	public String formatExpoentFunction(String function) {
		String result = "";

		double c = fractionToDouble(function.substring(0, function.indexOf("x")));
		if(function.contains("^")) {
			double n = fractionToDouble(function.substring(function.indexOf("^") + 1, function.length()));
			result = c + "x^" + n;
		}else {
			result = c +"x";
		}

		return result;
	}

	public double distanceBetweenTwoPoints3d(double[] firstPoint, double[] secondPoint) {
		return Math.sqrt((Math.pow(secondPoint[0] - firstPoint[0], 2) + Math.pow(secondPoint[1] - firstPoint[1], 2) + Math.pow(secondPoint[2] - firstPoint[2], 2)));
	}

	public double getAngleBetweenTwoVectors3d(double[] vector1, double[] vector2) {
		return Math.acos(((vector1[0] * vector2[0]) + (vector1[1] * vector2[1]) + (vector1[2] * vector2[2])) / (lengthOfVector3d(vector1) * lengthOfVector3d(vector2)));
	}

	public double lengthOfVector3d(double[] vector) {
		return Math.sqrt((vector[0] * vector[0]) + (vector[1] * vector[1]) + (vector[2] * vector[2]));
	}

	
}