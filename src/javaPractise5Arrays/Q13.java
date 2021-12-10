package javaPractise5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
	Scanner scan = new Scanner(System.in);
	int[] array = new int[8];
	
	int count=0;
	int count1=0;
	while(count<8) {
	System.out.println(count+1+". elemani girin");
	array[count] = scan.nextInt();
	
	if (array[count]%3==0) {
		count1++;
		}
	count++;
	}
	int[] neuArray = new int[count1];
	int a=0;
	for (int i = 0; i <array.length; i++) {
		
			if (array[i]%3==0) {
				neuArray[a]=array[i];
				a++;
			}
	}
	
	System.out.println(Arrays.toString(array));
	System.out.println("3'e bolunebilen "+count1+" tane eleman vardir.");
	System.out.println(Arrays.toString(neuArray));
	scan.close();
	}
}
