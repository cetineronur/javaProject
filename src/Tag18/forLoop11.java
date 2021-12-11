package Tag18;
import java.util.Scanner;
public class forLoop11 {
	public static void main(String[] args) {
		/*Fragen Sie den Benutzer nach zwei Nummern. 
		Schreiben Sie ein Programm, das die eingegebenen 
		Zahlen und alle dazwischen liegenden ganzen Zahlen 
		addiert und das Ergebnis ausgibt.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl unter 100 ein. Drücken Sie Enter und geben Sie die zweite Zahl ein ");
		double zahl = scan.nextDouble();
		int zahl1 = (int) zahl; 
		double zahl2 = scan.nextDouble();
		int zahl3 = (int) zahl2; 
		scan.close();
		
		int container =0;
		
		if(zahl1>zahl3) {
			for (int i = zahl1; i >=zahl3; i--) {
				container+=i;
							}
			System.out.println(container);
		}else {
			for (int i = zahl3; i >=zahl1; i--) {
				container+=i;
		}
			System.out.println(container);
		}
	}

}
