package tag24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList1 {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
				
		int arr[]= {3,5,5,6,3,5};
		int silinecekEleman=5;
				
		List<Integer> gecici = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {
				gecici.add(arr[i]);
			}
		}System.out.println("list olarak  : "+gecici);// list olarak istenmeyen eleman haric tm elemanlari gosterir.
		
		// soncu array olarak istiyorsak yeni arraye ekleyebiliriz.
		
		int[] neuArray = new int[gecici.size()];
		
		for (int i = 0; i < neuArray.length; i++) {
			neuArray[i] = gecici.get(i);
			
		}System.out.println("Array olarak : "+Arrays.toString(neuArray));

	}

}
