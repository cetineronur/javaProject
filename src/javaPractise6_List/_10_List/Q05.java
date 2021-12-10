package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.


    	Scanner input = new Scanner(System.in);
    	
    	int[] array = new int[6];
    	int count=0, sayi,tek=0;
    	
    	while(count<6 ) {
    	System.out.println(count+1+". sayiyi giriniz: ");
    	sayi=input.nextInt();
    	if (sayi%2==1) {
    		tek++;
    	}
    	array[count]=sayi;
       	count++;
        	}System.out.println("Tumsayilarin bulundugu array: "+Arrays.toString(array));
        
        	int[] arrayTek = new int[tek];
        	count=0;
    	for (int i = 0; i < array.length; i++) {
			
    		if (array[i]%2==1) {
				arrayTek[count]=array[i];
				count++;
			}
		}System.out.println("Tek sayilarin Dizisi: "+Arrays.toString(arrayTek));
		input.close();
    }
}
