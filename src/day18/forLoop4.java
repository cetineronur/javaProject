package day18;
import java.util.Scanner;
public class forLoop4 {
	public static void main(String[] args) {
		
		/*Fragen Sie den Benutzer nach einer ganzen Zahl kleiner als 
		100. Geben Sie Zahlen aus, die ein Vielfaches von 3 sind, 
		von 1 bis zur eingegebenen Zahl.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl unter 100 ein: ");
		double zahl = scan.nextDouble();
		int zahl1 = (int) zahl; 
		if (zahl1<0 ) {
			System.out.println("Sie haben eine negative Zahl eingegeben.");
		}else if(zahl1!=zahl) {
			System.out.println("Bitte ganze Zahl eingeben");
		}else if (zahl1>0) {
		
		for (int i = 1; i <=zahl1; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
	}
		scan.close();
	}
}
