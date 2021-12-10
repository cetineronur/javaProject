package tag31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class encokTekrarlananHarf1 {

	public static <Stringbuilder> void main(String[] args) {
		/*Count the words in a String one by one
	  Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
	  
	  For Example:
	  Input :  String is "Ali came to school and Ayse came to school"
	  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1*/
		
		String input="Ali came to school and Ayse came to school";
		String[] array =input.split(" ");
		//System.out.println(Arrays.toString(array));
		List<String> list = new ArrayList<>();
		int count=0;
		String str="";
		for (int i = 0; i < array.length; i++) {
			count=0;	
			for (int j = 0; j < array.length; j++) {
				if (array[i].equalsIgnoreCase(array[j])) {			
					count++;
					list.add(array[i]);
				}
			}if (!str.contains(list.get(i))) {
				str+=list.get(i)+"="+count+"#";
			}			
		}
		String arr2[]=str.split("#");
		System.out.println(Arrays.toString(arr2));
    }
}