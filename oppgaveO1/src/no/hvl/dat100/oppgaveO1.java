package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgaveO1 {
	public static void main(String[] args) {
		String bLonn = showInputDialog("Skriv in din bruttolønn: ");
		int lonn = Integer.parseInt(bLonn);
		
		double t0 = 0;
		double t1 = 0.017;
		double t2 = 0.04;
		double t3 = 0.132;
		double t4 = 0.162;
	
	if (lonn >=0 && lonn <= 184800) {
		showMessageDialog(null, "Ditt skattetrinn: " + lonn * t0);
	}
	else if (lonn >=184801 && lonn <= 260100) {
		showMessageDialog(null, "Ditt skattetrinn: " + lonn * t1);
	}
	else if (lonn >=260101 && lonn <= 651250) {
		showMessageDialog(null, "Ditt skattetrinn: " + lonn * t2);
	}
	else if (lonn >=651251 && lonn <= 1021550) {
		showMessageDialog(null, "Ditt skattetrinn: " + lonn * t3);
	}
	else if (lonn >=1021551) {
		showMessageDialog(null, "Ditt skattetrinn: " + lonn * t4);
	}
	}
}
