package javaPractise5Arrays;

import java.util.Arrays;


public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/
    	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
    	
    	Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
    	
    	int enBuyuk=0, enKucuk=1000;
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i]>enBuyuk) {
				enBuyuk=arr[i];
			}
			if (arr[i]<enKucuk) {
				enKucuk=arr[i];
			}
		}System.out.println("Dizinin en buyuk 2. sayisi ise: "+arr[arr.length-2]);
		System.out.println("En buyuk sayi: "+enBuyuk);
		System.out.println("En kucuk sayi: "+enKucuk);
    }

}
