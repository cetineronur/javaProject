package day02;
import java.util.Scanner;
public class scanner4_a {
	public static void main(String[] args) {

		/*Bitten Sie den Benutzer, Minuten einzugeben,
		Schreiben Sie ein Java-Programm, um Minuten in eine Anzahl von Jahren und Tagen umzuwandeln.
		EINGANG:
		Anzahl der Minuten: 3456789
		AUSGANG:
		3456789 Minuten waren ungefähr 6 Jahre 210 Tager
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dakika sayisi: ");
		int minute = scan.nextInt();
		double uhr, tag, jahr;
		
		uhr=minute/60;
		tag=uhr/24;
		jahr=tag/365;
		System.out.println(jahr);
		int jahr1= (int) jahr;
		System.out.println(jahr1);
		double jahr2=jahr-jahr1;
		int jahr3 =(int) (jahr2*365);
		
		System.out.println(minute+" dakika yaklasik "+jahr1+" yil "+(jahr3)+" gundur");
		scan.close();
	}

	
}