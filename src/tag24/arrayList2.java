package tag24;

import java.util.ArrayList;
import java.util.List;

public class arrayList2 {

	public static void main(String[] args) {
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler);
		System.out.println(harfler.remove(1)); // sadece Z yazar
		System.out.println(harfler); // [a,f,d]
		
		System.out.println(harfler.remove("F"));// gidip F yi kaldirir ve true doner.
		System.out.println(harfler.remove("B"));// listede B olmadigi icin remove yapamaz ve false yazar
		
		
		System.out.println(harfler);
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler);
		System.out.println(harfler.remove("A"));
		System.out.println(harfler);// ilk A yi siler
		
		harfler.add("A");
		
		System.out.println(harfler);
		
		harfler.removeAll(harfler);// verilen bir listeyi siler.
		System.out.println(harfler);
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekharfler = new ArrayList<>();
		silinecekharfler.add("A");
		silinecekharfler.add("C");
		silinecekharfler.add("F");
		
		System.out.println(harfler);
		System.out.println(silinecekharfler);
		
		System.out.println(harfler.removeAll(silinecekharfler));
		
		System.out.println(harfler);
		
		//eger listemiz integerlardan olusuyorsa 
		// remove(index) ve remove(object) methodlarri 
	}

}
