package Tag15;
import java.util.Scanner;
public class methodCreation1 {
	public static void main(String[] args) {
		
		//// Fragen Sie den Benutzer, wie viele Zahlen er summieren möchte.
		// Wenn der Benutzer 2, 3 oder 4 eingibt,
		// den Benutzer bitten, diese Zahlen einzugeben und die Summe der Zahlen auszudrucken.
		// Wenn der Benutzer die Anzahl der zu sammelnden Nummern größer als 4 eingibt, 
		//drucken Sie "Sie haben zu viele Nummern eingegeben, ich kann sie nicht hinzufügen".
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Wie viele Zahlen möchtest du sammeln?");
		int wahl = scan.nextInt();
	
		if (wahl==2) {
		zweiSammeln();
		
		}else if(wahl==3) {
			
		dreiSammeln();
		
		}else if (wahl==4) {
		vierSammeln();
		}else if(wahl>4||wahl<2) {
		System.out.println("Sie haben zu viele Nummern eingegeben, ich kann sie nicht hinzufügen");
		}
		scan.close();
	}
	private static void vierSammeln() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte vier Zahlen hintereinander eingeben\\n");
		double nummer1=scan.nextDouble();
		double nummer2=scan.nextDouble();
		double nummer3=scan.nextDouble();
		double nummer4=scan.nextDouble();
		System.out.println("Summe von vier Zahlen: "+(nummer1+nummer2+nummer3+nummer4));
		scan.close();
		
	}
	private static void dreiSammeln() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie drei Zahlen hintereinander ein\n");
		double nummer1=scan.nextDouble();
		double nummer2=scan.nextDouble();
		double nummer3=scan.nextDouble();
		System.out.println("die Summe der drei eingegebenen Zahlen: "+(nummer1+nummer2+nummer3));
		scan.close();
		
	}

	private static void zweiSammeln() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie zwei Zahlen hintereinander ein\n");
		double nummer1=scan.nextDouble();
		double nummer2=scan.nextDouble();
		
		System.out.println("die Summe der beiden eingegebenen Zahlen: "+(nummer1+nummer2));
		scan.close();
		
	}

}
