package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgaveO3 {
	public static void main(String[] args) {
		
		boolean ugyldig;
	
		String input = showInputDialog("Skriv in et heltall: ");
		int n = Integer.parseInt(input);
		int temp = 1;
		ugyldig = (n < 0 || 12 < n);
		while(n>1) {
			temp *=n;
			n--;
		}
		if (ugyldig) {
			showMessageDialog(null, "Ugyldig!");
		}
		else {
			showMessageDialog(null, "Fakulteten av " + input + " er: " + temp);
		}
	}
}
