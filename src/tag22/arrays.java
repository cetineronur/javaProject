package tag22;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		int[] numbers = {2,8,6,4};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		
		String isimler[]= {"hacer", "Onur", "murat", "Ozer", "Mehmet"};
		//isimler array'inde Murat ismi var mi?
		// Arrayde arama yapmadan once siralam yapmaliyiz.
		Arrays.sort(isimler);// sort yaptigimizda arrayimiz kalici olarak degisir.
		System.out.println(Arrays.toString(isimler));
		
		isimler[4] = "Ainagul";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); // Ainagul basa geldi.
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); // -3 Murat olsaydi 3.sirada olurdu
		
		System.out.println(Arrays.binarySearch(isimler, "Onur")); // 2
		System.out.println(Arrays.binarySearch(isimler, "Tugba")); //-5
	}

}
