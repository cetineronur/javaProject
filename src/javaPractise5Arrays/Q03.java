package javaPractise5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

    	Scanner scan = new Scanner(System.in);
    	System.out.println("kac sayi gireceksiniz:");
    	int sayi = scan.nextInt();
    	int[] array = new int[sayi];
    	
    	int count=0;
    	while(count<sayi) {
    		System.out.println("dizinin elemanlarini girin:");
    		int a=scan.nextInt();
    		array[count]=-a;
    		count++;
    	}System.out.println(Arrays.toString(array));
    	scan.close();
    }


}
