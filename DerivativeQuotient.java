import javax.swing.JOptionPane;
public class DerivativeQuotient {

	public DerivativeQuotient() {
		String numerator = JOptionPane.showInputDialog("Enter numerator: ");
		String denominator = JOptionPane.showInputDialog("Enter denominator: ");

		numerator = numerator.replaceAll(" ", "");
		denominator = denominator.replaceAll(" ", "");

		System.out.println(numerator + " / " + denominator);

	}
}