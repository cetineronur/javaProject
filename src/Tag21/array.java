package Tag21;

import java.util.Arrays;

public class array { 

	public static void main(String[] args) {

		//soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun 	
		
		String arr[]=new String[4];
		
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";
		
		//Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin
		
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"};
		
		arr[0] = "Can";
		arr[2] = "Gul";
		
		System.out.println(arr2[1]);//Veli
		
		//son elementi yazdirin
		System.out.println(arr2[arr.length-1]); // Fatma
		
		
		//System.out.println(arr[arr.length]); // yazdigin index sinirlarin disinda
		
		int arr3[]= {2,4,5,6,78,89};
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");//array in tum elemanlarini yazdirdik
		}
		
		System.out.println(Arrays.toString(arr3));// yada arrays Class'indan yardim alip direk array olarak yazdirabiliriz.
		
		
	}
}
