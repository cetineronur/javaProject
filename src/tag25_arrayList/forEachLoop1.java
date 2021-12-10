package tag25_arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class forEachLoop1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kac deger gireceksiniz: ");
		int length=scan.nextInt();
		int[] array = new int[length];
		int sayi =0;
		
		for (int i = 0; i <length; i++) {
		System.out.println(i+1+". sayiyi giriniz:");
		sayi=scan.nextInt();
		array[i]=sayi;
		}
		System.out.println(Arrays.toString(array));
		
		int carp=1;
		for (int i : array) {
			carp*=i;
		}System.out.println("Dizinin icndeki sayilarin carpimi: "+carp);
	}

}
