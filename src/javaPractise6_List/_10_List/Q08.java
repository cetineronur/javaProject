package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /*
         * 10 elamanli bir array olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
    	String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
    	ArrayList<String> list = new ArrayList<>();
    	String a=isimler[2];
    	isimler[2]=isimler[7];
    	isimler[7]=a;
    	System.out.println(Arrays.toString(isimler));
    	
    	/*for (int i = 0; i < isimler.length; i++) {
    			list.add(isimler[i]);
		}
    	list.set(2, list.get(7));
    	list.set(7, list.get(2));
    	
    	
    	System.out.println(list);*/



    }

}
