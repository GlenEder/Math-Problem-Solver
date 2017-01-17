import javax.swing.*;

public class DistanceFormula3d {

	public DistanceFormula3d() {
		String firstPoint = JOptionPane.showInputDialog(null, "Enter the first point seperated by commas w/out parantheses: ");

		String secondPoint = JOptionPane.showInputDialog(null, "Enter the second point seperated by commas w/out parantheses: ");

		//remove whitespace
		firstPoint = firstPoint.replaceAll(" ", "");
		secondPoint = secondPoint.replaceAll(" ", "");

		//get numbers
		String[] firstPointNumbers = firstPoint.split(",");
		String[] secondPointNumbers = secondPoint.split(",");

		double[] firstPointNums = new double[3];
		double[] secondPointNums = new double[3];

		for(int i = 0; i < firstPointNumbers.length; i++) {
			firstPointNums[i] = Double.parseDouble(firstPointNumbers[i]);
		}

		for(int i = 0; i < secondPointNumbers.length; i++) {
			secondPointNums[i] = Double.parseDouble(secondPointNumbers[i]);
		}

		Utils util = new Utils();
		double answer = util.distanceBetweenTwoPoints3d(firstPointNums, secondPointNums);
		JOptionPane.showMessageDialog(null, "Distance = " + answer + ", sqrt(" + answer * answer + ")");

	}
}