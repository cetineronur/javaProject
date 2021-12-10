package javaPractise1;
import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
		/*Schreiben Sie ein Java-Programm, das die erste Hälfte einer Variablen 
		 * doppelter Länge an die Konsole ausgibt.
		STICHPROBE:
		EINGANG: Python
		AUSGANG: Pyt
	    */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Texte ein");
    	String input = scan.nextLine();
    	int length = input.length();
    	
    	if (length%2==0) {
    		System.out.println("Die erste Hälfte des eingegebenen Wortes: "+input.substring(0,length/2));
		}else {
			System.out.println("Bitte geben Sie eine Variable mit gerader Länge ein");
		}
    	scan.close();  	
    }
}
