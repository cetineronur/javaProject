package day02;
import java.util.Scanner;
public class scanner6_a {
	public static void main(String[] args) {
		/*Holen Sie sich eine Zahl vom Benutzer und 
		schreiben Sie ein Programm, das die Hälfte des Würfels der Zahl 
		an die Konsole ausgibt.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Zahl ein: ");
		int zahl = scan.nextInt();
	
		System.out.println("die Hälfte des Würfels der Zahl: "+((zahl*zahl*zahl))/2);
		scan.close();
	}

}
