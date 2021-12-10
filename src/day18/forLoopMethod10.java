package day18;

import java.util.Scanner;

public class forLoopMethod10 {

	public static void main(String[] args) {
		//Fordern Sie einen String vom Benutzer an. 
		//Vom Benutzer eingegebene Zeichenfolge
		//Schreiben Sie ein Method, das nach Palindromen sucht.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie einen Text ein: ");
		String text = scan.nextLine();
		int length=text.length();
		scan.close();
		
		umkehrt(text,length);
		
	}

	private static String umkehrt(String text, int length) {
		String umgekehrt="";
		for (int i = length-1; i>=0; i--) {
			umgekehrt+=text.substring(i, i+1);
		}
		if (text.equals(umgekehrt)) {
			System.out.println("girdiginiz palindromdur.");
		}else {
			System.out.println("girdiginiz palindrom degildir");
		}
		return umgekehrt;
	}

}
