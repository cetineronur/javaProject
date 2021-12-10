package tag35_Encapsulation_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ogrenci {

	private ArrayList<String> list =new ArrayList<>(Arrays.asList("Onur","Mustafa","Nevin","Elif Rana","cetiner"));
	
	public void setIsim(String isim,int a) {
		this.list.add(isim);
		this.list.remove(a);
	}
	
	public ArrayList<String> getIsim() {
		return  list;
	}
}