package Tag18;

import java.util.Scanner;

public class nestedForLoop3 {

	public static void main(String[] args) {
		/*Erstellen Sie eine Multiplikationstabelle 
		basierend auf der eingegebenen Zahl und fordern Sie 
		den Benutzer auf, eine positive Zahl einzugeben.
		Wenn der Benutzer beispielsweise 3 eingibt
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Zahl ein: ");
		int zahl = scan.nextInt();
		
		// carpim tablosu
		
		for (int sutun = 1; sutun <= zahl; sutun++) {
			for (int i = 1; i <= zahl; i++)  {
			
			System.out.print(sutun*i +" ");
		 } System.out.println("");
		 
		}

	}

}
