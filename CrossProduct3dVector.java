import javax.swing.JOptionPane;

public class CrossProduct3dVector {

	public CrossProduct3dVector() {

		String a = JOptionPane.showInputDialog(null, "Enter vector a: ex 1, 2, -4: ");
		String b = JOptionPane.showInputDialog(null, "Enter vector b: ex 2, -3, 5: ");

		a = a.replaceAll(" ", "");
		b = b.replaceAll(" ", "");

		String[] aParts = a.split(",");
		String[] bParts = b.split(",");

		double[] numsA = new double[3];
		double[] numsB = new double[3];

		for(int i = 0; i < 3; i++) {
			numsA[i] = Double.parseDouble(aParts[i]);
		}

		for(int i = 0; i < 3; i++) {
			numsB[i] = Double.parseDouble(bParts[i]);
		}

		Utils utils = new Utils();
		double[] answer = utils.crossProductVector3d(numsA, numsB);
		String result = "<" + answer[0] + ", " + answer[1] + ", " + answer[2] + ">";
		JOptionPane.showMessageDialog(null, result);
	}
}