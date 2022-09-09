package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class O2 {

	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
		String poeng = showInputDialog("Hva er din poengsum?");
		int p = parseInt(poeng);
		
	
		if (p>= 90 && p<=100) {
			System.out.println("A");
		
		} else if(p>=80 && p<90) {
			System.out.println("B");
		
		} else if(p>=60 && p<80) {
			System.out.println("C");
		
		} else if(p>=50 && p<60) {
			System.out.println("D");
		
		} else if(p>=40 && p<50) {
			System.out.println("E");
			
		} else if(p>=0 && p<40) {
			System.out.println("F");
			
		} else {
			System.out.println("Ugyldig poengsum!, prøv igjen");
			i = i - 1;
			
		}
		}
	}

	}


