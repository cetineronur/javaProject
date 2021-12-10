package tag24;

import java.util.ArrayList;
import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		/*Bir dizi sayı "Boom!"alan ve dizide 7 rakamı görünüyorsa dönen bir işlev 
		oluşturun . Aksi takdirde iade edin "there is no 7 in the array".
		Örnekler
		sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
		// 7 contains the number seven.
		sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
		// None of the items contain 7 within them.
		sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
		// 97 contains the number seven.*/

		
		int[] array= {9, 55, 60, 97, 87};
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		if (list.contains(7)) {
			System.out.println("Boom");
		if (!list.contains(7)) {
		
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i)%10==7) {
					System.out.println("Boom");
				}else {
				}System.out.println("there is no 7 in the array");
					break;
				}
			}
		
		
		
	}

}
