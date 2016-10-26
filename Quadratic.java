import java.lang.Math;
import javax.swing.*;

public class Quadratic {
	public Quadratic() {
		

		//get a
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter A: "));

		//get b
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter B: "));

		//get c
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter C: "));

		//-b +/- sqrt(b^2 - 4ac) / 2a
		boolean a1 = true;
		boolean a2 = true;

		double answer1 = 0.0;
		double answer2 = 0.0;

		try{
			answer1 = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
		}catch (Exception e) {
			a1 = false;
		}

		try{
			answer2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
		}catch (Exception e) {
			System.out.println("Answer 2 does not exist");
			a2 = false;
		}

		

		if(a1) {
			JOptionPane.showMessageDialog(null, "Answer 1: " + answer1);
		}else {
			JOptionPane.showMessageDialog(null, "Answer 1 doesn't exist");
		}

		if(a2) {
			JOptionPane.showMessageDialog(null, "Answer 2: " + answer2);
		}else {
			JOptionPane.showMessageDialog(null, "Answer 2 doesn't exist");
		}
	}
}
