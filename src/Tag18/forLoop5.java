package Tag18;

import java.util.Scanner;

public class forLoop5 {

	public static void main(String[] args) {
		/*Fragen Sie den Benutzer nach einer ganzen Zahl kleiner 
		als 100. Drucken Sie Zahlen, die ein Vielfaches von 3 oder 
		5 sind, von 1 bis zur eingegebenen Zahl.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl unter 100 ein: ");
		double zahl = scan.nextDouble();
		int zahl1 = (int) zahl; 
		scan.close();
		
		for (int i=1; i<=zahl1; i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i+", ");
			}
		}
	}
}
