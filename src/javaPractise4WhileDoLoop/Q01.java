package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		Scanner scan =new Scanner(System.in);
		System.out.println("Armstrong sayi olup olmadigini kontrol etmek bir sayi giriniz:");
		int sayi = scan.nextInt();
		String sayi1 = String.valueOf(sayi);
		int toplam=0;
		int a=0;
		while (sayi>=1){
			a=sayi%10;
			sayi/=10;
			toplam+=a*a*a;
		}
		int sayi11 = Integer.valueOf(sayi1);
		if (sayi11==toplam) {
			System.out.println("Armstrong sayidir");
		}else {
			System.out.println("Armstrong sayi degildir");
		}
		scan.close();
	}

}
