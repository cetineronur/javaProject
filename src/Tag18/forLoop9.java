package Tag18;

import java.util.Scanner;

public class forLoop9 {

	public static void main(String[] args) {
		//Fordern Sie einen String vom Benutzer an. 
		//Vom Benutzer eingegebene Zeichenfolge
		//Schreiben Sie ein Programm, das nach Palindromen sucht.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie einen Text ein: ");
		String text = scan.nextLine();
		int length=text.length();
		scan.close();
		
		String umgekehrt="";
		for (int i = length-1; i>=0; i--) {
			
			umgekehrt+=text.substring(i, i+1);
		}
			if (text.equals(umgekehrt)) {
				System.out.println("girdiginiz text palindromdur.");
			}else {
				System.out.println("girdiginiz text palindrom degildir");
			}
				
			
		

	}

}
