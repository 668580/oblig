package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class O1 {

	public static void main(String[] args) {
	
		String brutto = showInputDialog("Hva er bruttoinntekten din?");
		int Bruttotxt = parseInt(brutto);
	
		if (Bruttotxt<=190349) {
		System.out.println("Din trinnskatt er 0kr");
		}
		
		else if(Bruttotxt<=267899) {
		double prosent1 = Bruttotxt*0.017;
		System.out.println("Din trinnskatt er: " + prosent1 + "kr");
	}
		else if (Bruttotxt<=643799) {
		double prosent2 = Bruttotxt*0.04;
		System.out.println("Din trinnskatt er: " + prosent2 + "kr");
		}
	
		else if (Bruttotxt<=969199) {
			double prosent3 = Bruttotxt*0.134;
		System.out.println("Din trinnskatt er: " + prosent3 + "kr");
		}	
	
		else if (Bruttotxt<=1999999) {
			double prosent4 = Bruttotxt*0.164;
			System.out.println("Din trinnskatt er: " + prosent4 + "kr");
		
		} else {
			double prosent5 = Bruttotxt*0.174;
			System.out.println("Din trinnskatt er: " + prosent5 + "kr");
		}
		
	
		
		
		

	}
}
	

			
			
		
		
	


