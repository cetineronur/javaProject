package tag25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSilme {

	public static void main(String[] args) {
		// verilen bir listede, icinde belirli bir harf olan elemanlari silen bir method yazin
		
		List<String> str = new ArrayList<>();
		
		str.add("ceyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");
		
		System.out.println(str);
		String silinecekharf="a";
		
		str=killThemAll(str,silinecekharf);
		System.out.println(str);
	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		for (int i = str.size()-1; i>=0; i--) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
			}
		}
		return str;
	}

}
