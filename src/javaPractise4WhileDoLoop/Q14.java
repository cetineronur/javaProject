package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bir sayi giriniz:");
    	int sayi = scan.nextInt();
    	int carpim =1;
    	while(sayi>0) {
       		carpim*=sayi;
    		sayi--;
    	}System.out.println("sayinin faktoriyeli: "+carpim);
    	scan.close();
    }
}


