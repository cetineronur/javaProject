package javaPractise3;

import java.util.Scanner;

public class Q14 {

    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {
        /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    	Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi giriniz : ");
		int sayi=scan.nextInt();
		
		for (int i = 0; i <=sayi; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
    	
    	for (int i = 0; i <=sayi ; i++) {
			for (int j =i; j<=sayi ; j++) {
				System.out.print("* ");
			}System.out.println();
		}scan.close();
        
    }
}
