package javaPractise5Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
			*
			*/
		String str = "GayetBasarılı";
		String str1 = "CoookBasarılı";
		String[] array=str.split("");
		System.out.println(Arrays.toString(array));
		List<String> list =new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}System.out.println(list);

		
	}

}
