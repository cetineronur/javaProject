package Tag18;

import java.util.Scanner;

public class forLoop7 {

	public static void main(String[] args) {
		//Fragen Sie den Benutzer nach einem String und 
		//drucken Sie den String in umgekehrter Reihenfolge aus.

		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie einen Text ein: ");
		String text = scan.nextLine();
		int length=text.length();
		
		for (int i =length-1; i>=0; i--) {
			System.out.print(text.substring(i, i+1));
		}
	scan.close();
	
	}

}
