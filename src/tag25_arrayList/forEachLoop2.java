package tag25_arrayList;

import java.nio.charset.Charset;
import java.util.ArrayList;

public class forEachLoop2 {

	public static void main(String[] args) {
		// Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
		//yazdiriniz. ipucu: split()

		String str ="Onur cetiner bu isi yapacak";
		
		//ArrayList<Charset> split = new ArrayList<>();
		
		String[] str1= str.split("");
		
		for (String string : str1) {
			System.out.print(string+" ");
		}
		
		
	}

}
