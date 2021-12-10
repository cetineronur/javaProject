package day21;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int kova=0;
		
		int arr[]= {2,3,4,5,6,8,7};
		
		for (int i = 0; i < arr.length; i++) {
			kova+=arr[i];
		}System.out.println(kova);
		
		Arrays.sort(arr);//dizinin elemanlarini kucukten buyuge siralar.
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]+ " "); // elamanlari ters sirada yazdirdik.
		}
		
		int tersArray[]=new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
		}System.out.println(Arrays.toString(tersArray)); 
		
	}

}
