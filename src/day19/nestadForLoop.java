package day19;

import java.util.Scanner;

public class nestadForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tam sayi girmesini isteyin.
		//girdigi sayiya gore asagidaki sekli yazdirin.
		
		/*1
		 *1 2
		 *1 2 3 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Zahl ein: ");
		int zahl = scan.nextInt();

		for (int satir = 1; satir<=zahl; satir++) {
			for (int j = 1; j <=satir; j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
