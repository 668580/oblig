package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3a {
	
	public static void main(String[] args) {
		
		String heltall = showInputDialog("Skriv inn et heltall");
		int tall = parseInt(heltall);
		int n = tall;
		int svar = 1;
		
		while (tall>0) {
			svar *=tall;
			tall--;
		}
		System.out.println(n + " fakultet er det samme som " + svar);
	}

}
