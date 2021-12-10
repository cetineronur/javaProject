package tag25_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> isimler = new ArrayList<>();
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler); //[Kutlu, Emrah, Ferhat]
		
		Collections.sort(isimler);
		System.out.println(isimler);
	}

}
