package Tag14;
import java.util.Scanner;
public class methodCreation1 {
	public static void main(String[] args) {
		/*Fragen Sie den Benutzer nach zwei Nummern. Schreiben Sie zwei separate Methoden, die Quadrate und Würfel von Zahlen drucken.
		fragen Sie den Benutzer uns
		Wenn 2, die Methode, die die Quadrate hinzufügt,
		Wenn 3 geschrieben wird, funktioniert die Methode, die die Summe der Würfel bildet.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte gebe eine Zahl ein");
		int nummer1 = scan.nextInt();
		
		System.out.println("Bitte geben Sie noch eine Zahl einz");
		int nummer2 = scan.nextInt();
		
		System.out.println("zum quadrieren 1:\nkup zum wurfel 2:\n drucken Sie ");
		int wahl =scan.nextInt();
		if (wahl==1) {
			quadrat(nummer1,nummer2);
		}else {
			wurfel(nummer1,nummer2);
		}
		scan.close();
			
	}

	public static void wurfel(int nummer1, int nummer2) {
		int kup=(nummer1*nummer1*nummer1)+(nummer2*nummer2*nummer2);
		System.out.println(kup);
	}

	public static void quadrat(int nummer1, int nummer2) {
		int kare=(nummer1*nummer1)+(nummer2*nummer2);
		System.out.println(kare);
	}

}
