package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /*
    100 den kucuk asal sayilari yazdiran bir program yaziniz
     */
    public static void main(String[] args) {

    	
    	List<Integer> list =new ArrayList<>();
    	list.add(2);
		list.add(3);
		list.add(5);
    	for (int i = 1; i < 100; i++) {
			if (i%2!=0&&i%10!=5&&i%3!=0) {
				if (((i%10)+(i/10))/3!=0) {
					list.add(i);
				}
				
			}
		}
    	System.out.println(list);
    	
    	
    }
}
