package javaPractise2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
    /*
     Problem Tanımı :
        powerOfThree isminde bir method oluşturun.
        Parametre olarak int, Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 
        3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false */
     
		Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi giriniz : ");
		int num=scan.nextInt();
		boolean a=false;
		powerOfThree(num, a);  
		scan.close();
	}

	private static void powerOfThree(int num, boolean a) {

		if(a=num%3==0) {
			System.out.println(a);
		}else {
			System.out.println(a);
		}
				
	} 
}
