package javaPractise3;

import java.util.Scanner;

public class Q10 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. 
     Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. 
    Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. 
      (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

    	Scanner scan =new Scanner(System.in);
    	System.out.println("Bir harf giriniz");
    	String harf = scan.next().toLowerCase(); 
    	String sesli="aeiuo";
    	String sessiz ="bcdfghjklmnprstvyzxqw";
    	if (harf.length()==1) {
			
    	for (int i = 0; i < 5; i++) {
			
    		if (harf.contains(sesli.substring(i,i+1))) {
    		System.out.println("girdiginiz harf sesli harftir.");
    		} 
    	}for(int j = 0; j < 21; j++) {
			if (harf.contains(sessiz.substring(j,j+1))) {
			System.out.println("girdiginiz harf sessiz harftir.");
			}
		} 
    	}else {
    		System.out.println("lutfen bir karakter giriniz.");
    	}
    	scan.close();
    }
}

