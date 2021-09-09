package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgaveO2 {
	public static void main(String[] args) {
		
		final int ANT_ELEVER = 10;
		for (int elevnr = 1; elevnr <= ANT_ELEVER; elevnr++) {
		String poengSum = showInputDialog("Skriv in din poengsum: ");
		int pSum = Integer.parseInt(poengSum);
	
		String mld;
	if (pSum > 100) {
		mld = "Ugyldig poengsum. Kan ikke være over 100.";
	}
	else if (pSum >= 90) {
		mld = "Din karakter: A.";
	}
	else if (pSum >= 80) {
		mld = "Din karakter: B.";
	}
	else if (pSum >= 60) {
		mld = "Din karakter: C.";
	}
	else if (pSum >= 50) {
		mld = "Din karakter: D.";
	}
	else if (pSum >= 40) {
		mld = "Din karakter: E.";
	}
	else if (pSum >= 0) {
		mld = "Din karakter: F.";
	}
	else {
		mld = "Ugyldig poengsum. Kan ikke være negativ.";
	}
	showMessageDialog(null, mld);
		}
	}
}

