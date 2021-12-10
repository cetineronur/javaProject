package tag23;

import java.util.Arrays;

public class arrays3 {

	public static void main(String[] args) {
		// verilen iki array'i birlestiren ve sonucu yeni arraye atan 
		
		int[] arr1 = {3,5,7,10};
		int[] arr2 = {2,4,6,8,9};
		
		int[] birlesikArray = birlestir(arr1,arr2); 
		System.out.println(Arrays.toString(birlesikArray));//[3,5,0,0,0]
		

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[] = Arrays.copyOf(arr1,arr1.length+arr2.length);
		return birlesikArray;
	}

}
