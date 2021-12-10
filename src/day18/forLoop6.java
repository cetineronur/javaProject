package day18;

import java.util.Scanner;

public class forLoop6 {

	public static void main(String[] args) {
		/*Fragen Sie den Benutzer nach einer ganzen Zahl 
		kleiner als 100. Drucken Sie alle Zahlen von 1 bis zur eingegebenen Zahl.
		Jedoch;
		- Wenn die Zahl ein Vielfaches von 3 ist, ersetzen Sie die Zahl durch "Java".
		- Wenn die Zahl ein Vielfaches von 5 ist, drucke "Nice" anstelle der Zahl.
		- Wenn die Zahl ein Vielfaches von 3 und 5 ist, drucke "Java is Beautiful" anstelle der Zahl.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl unter 100 ein: ");
		double zahl = scan.nextDouble();
		int zahl1 = (int) zahl; 
		
		for (int i = 1; i<=zahl1; i++) {
			if (i%3==0&&i%5==0) {
				System.out.println("Java ist Beautiful");
			}else if(i%3==0) {
				System.out.println("Java");
			}else if(i%5==0) {
				System.out.println("Nice");
			}else {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
