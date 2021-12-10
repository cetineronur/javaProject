package javaPractise5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac deger gireceksiniz: ");
		int sayi =scan.nextInt();
		int[] array=new int[sayi];
		int count=0;
		while(count<sayi) {
			System.out.println(count+1+". sayiyi giriniz: ");
			int sayi1=scan.nextInt();
			array[count]=sayi1;
			count++;
		}System.out.println(Arrays.toString(array));
		
		int[] neuarray = new int[sayi];
		for (int i = 0; i < array.length; i++) {
			neuarray[i]=array[i]*array[i];
		}System.out.println("yeni dizimiz: "+Arrays.toString(neuarray));
		scan.close();
	}

}
