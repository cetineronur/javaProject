package tag30;

import java.util.ArrayList;
import java.util.List;

public class immutableClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Ali";
		str.toUpperCase();// str = = > ALI yapar.
		System.out.println(str);// Ali
		System.out.println(str.toUpperCase()); //ALI
		System.out.println(str);//Ali
		
		List<String> isimler = new ArrayList<>();
		System.out.println(isimler);
		
		isimler.add("Ali");
		System.out.println(isimler);//[Ali]
		isimler.set(0, "Veli");
		System.out.println(isimler); //[Veli]
		
		
		
	}

}
