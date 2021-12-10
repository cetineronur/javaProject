package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */
    	int[] array= {5,6,7,8,9};
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
    	int toplam=0;
    	for (int i = 0; i <list.size(); i++) {
			toplam+=list.get(i)*list.get(i);
		}System.out.println("dizideki sayilarin kareleri toplami: "+toplam);
    }
}
