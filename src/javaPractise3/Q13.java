package javaPractise3;

import java.util.Scanner;

public class Q13 {
		
	public static void main(String[] args) {
		
		/*Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         * ORNEK:
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		
		Scanner scan =new Scanner(System.in);
    	System.out.println("Bir cumle giriniz");
    	String cumle = scan.nextLine();
    	System.out.println("Bir harf giriniz");
    	char harf =scan.next().charAt(0);
    	int count=0;
    	
    	for (int i = 0; i <cumle.length()-1; i++) {
			if (harf==cumle.charAt(i)) {
				count++;
			}
		}System.out.println(cumle+ " cumlesinde "+harf+" harfi "+count+" tane var.");
				
		scan.close();
		
	}

}
