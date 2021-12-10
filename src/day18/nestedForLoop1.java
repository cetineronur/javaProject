package day18;

import java.util.Scanner;

public class nestedForLoop1 {

	public static void main(String[] args) {
		/*Zeichnen Sie die folgende Abbildung, 
		die den Benutzer auffordert, eine positive Zahl einzugeben, 
		und zwar entsprechend der eingegebenen Zahl
		*
		* *
		* * *
		* * * *  */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein zahl ein: ");
		int zahl = scan.nextInt();
		scan.close();
		
		for (int i = 1; i<=zahl; i++) {
			for (int j = zahl-i; j<zahl ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/* Output 4
		*
		**
		***
		****
		*/
		
	}

}
