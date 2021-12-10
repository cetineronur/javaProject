package day18;

import java.util.Scanner;

public class nestedForLoop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Zahl ein: ");
		int zahl = scan.nextInt();
		
		for (int i =1 ; i <=zahl; i++) {
			for (int j = zahl-i; j < zahl; j++) {
				System.out.print("**");
			}
		System.out.println();
		}
		scan.close();
/* Output 
 4
**
****
******
********
 */
	}

}
