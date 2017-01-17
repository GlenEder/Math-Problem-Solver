import javax.swing.JOptionPane;

public class AngleTwoVectors3d {

	public AngleTwoVectors3d() {
		String v1 = JOptionPane.showInputDialog(null, "Enter the first vector: ex.) 1,4,-4:");
		String v2 = JOptionPane.showInputDialog(null, "Enter the second vector: ex.) 2, -1, 6:");

		v1 = v1.replaceAll(" ", "");
		v2 = v2.replaceAll(" ", "");

		String[] v1parts = v1.split(",");
		String[] v2parts = v2.split(",");

		double[] v1numbers = new double[3];
		double[] v2numbers = new double[3];

		for(int i = 0; i < 3; i++) {
			v1numbers[i] = Double.parseDouble(v1parts[i]);
		}

		for(int i = 0; i < 3; i++) {
			v2numbers[i] = Double.parseDouble(v2parts[i]);
		}

		Utils util = new Utils();

		double theta = util.getAngleBetweenTwoVectors3d(v1numbers, v2numbers);

		JOptionPane.showMessageDialog(null, "Theta = " + theta + "\n= " + Math.toDegrees(theta) + " degrees");
	}
}