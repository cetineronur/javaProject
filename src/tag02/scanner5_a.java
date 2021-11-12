package day02;
import java.util.Scanner;
public class scanner5_a {
	public static void main(String[] args) {
		/*Holen Sie sich die Seitenlänge des Quadrats vom Benutzer und schreiben Sie ein Programm, das die Fläche und den Umfang des Quadrats auf der Konsole ausgibt.
		Beispielausgabe:
		Bereich: 9
		Umfang: 12
		Scanner scan = new Scanner(System.in);
		System.out.println("Dakika sayisi: ");
		int minute = scan.nextInt();
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die Seitenlänge des Quadrats ein: ");
		int lange = scan.nextInt();
		int alan=lange*lange;
		int cevre=4*lange;
		
		System.out.println("Alan: "+alan);
		System.out.println("Cevre: "+cevre);
		scan.close();
		
		

	}

}
