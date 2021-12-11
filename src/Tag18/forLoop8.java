package Tag18;

import java.util.Scanner;

public class forLoop8 {

	public static void main(String[] args) {
		//Fragen Sie den Benutzer nach einem String und schreiben 
		//Sie eine Methode, die den String umkehrt.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie einen Text ein: ");
		String text = scan.nextLine();
		int length=text.length();
		
		umkehrt(text,length);
		System.out.println(umkehrt(text, length));
		scan.close();
	}

	private static String umkehrt(String text, int length) {
		
		String umgekehrt="";  // Ich habe eine leere String erstellt
		
		for (int i = length-1; i>=0; i--) {
			umgekehrt+=text.substring(i, i+1);  // Ich werfe die Buschtaben vom loop in den Container
			
		}
	return umgekehrt;
	}

}
