package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
         /*
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("bir sayi giriniz:");
    	int sayi = scan.nextInt();
    	
    	for (int i = 1; i <=sayi; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}
		}
    	scan.close();
    }
}
