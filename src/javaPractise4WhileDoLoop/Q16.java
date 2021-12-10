package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // --------GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
    	Scanner scan = new Scanner(System.in);
    	System.out.println("bir sayi giriniz:");
    	int sayi = scan.nextInt();
	    int count=-10;
	    int a=1;
	    int toplam=0;
    	while(sayi>=count){
    		a=sayi%10;//5 2
       		toplam+=a;
       		sayi/=10;//12 1
       		count++;
    	}System.out.println("girdiginiz sayinin basamak sayilari toplami: "+toplam);
    	scan.close();
    	
    }

}
