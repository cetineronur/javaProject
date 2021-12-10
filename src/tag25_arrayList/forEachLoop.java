package tag25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachLoop {

	public static void main(String[] args) {
		// bazen index ile hic ugrasmadan bir array veya listedeki tum elemanlari gozden gecirmek isteriz.

		int[] array = {1,2,4,80,43};
		for (int i : array) {
			System.out.print(i+" ");
		}
		List<Integer> list = new ArrayList<>();
		System.out.println();
		for (int i : array) {
			list.add(i);
			
		}System.out.println("List hali: "+list);
		
	}

}
