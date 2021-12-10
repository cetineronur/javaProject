package javaPractise5Arrays;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */

		Scanner scan = new Scanner(System.in);
		System.out.println("kac deger girmek istiyorsunuz: ");
		int sayi = scan.nextInt();
		int[] array = new int[sayi];
		
		int count=0;
		while(count<sayi) {
			System.out.println(count+1+". sayiyi giriniz: ");
			array[count]=scan.nextInt();
			count++;
		}if (array[0]==array[sayi-1]) {
			System.out.println("ilk ve son deger aynidir");
		}else {
			System.out.println("ilk ve son deger ayni degildir");
		}
		scan.close();
	}

}
