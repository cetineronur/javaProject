package javaPractise2;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
 /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir 
        kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
	Scanner scan = new Scanner(System.in);
	System.out.println("tekrar eden harfleri silmek icin bir cumle giriniz:");
	String cumle = scan.nextLine();
	int length=cumle.length();
	String tekrarsiz=" ";
	String tekrarli="";
	System.out.println(birKezTekrar(length,cumle,tekrarsiz,tekrarli));
	scan.close();
	}
	
	private static String birKezTekrar(int length, String cumle, String tekrarsiz, String tekrarli) {
		for (int i = 0; i <length; i++) {
			if (cumle.substring(i+1).contains(cumle.substring(i,i+1))) {
			
				tekrarli+=cumle.charAt(i);
			}else {
				
				tekrarsiz+=cumle.charAt(i);
			}
		}
		//System.out.println(tekrarsiz);
		System.out.println(tekrarli);
		return tekrarsiz;
	}
	
}