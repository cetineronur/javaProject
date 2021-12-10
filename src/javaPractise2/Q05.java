package javaPractise2;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("icinde kac kelime var kontrol etmek icin bir cumle giriniz:");
    	String cumle = scan.nextLine();
       int length=cumle.length();
       int sayac=0;
       int a=1;
    	System.out.println("girdiginiz cumle "+kacTane(cumle,length,sayac,a)+" kelimeden olusmaktadir.");
    scan.close();
    }

	private static int kacTane(String cumle, int length, int sayac, int a) {
		
		for (int i = 0; i<length; i++) {
			if (cumle.charAt(i)==' ') {
				a++;
			}
		}
		return a;
		
	}
}
