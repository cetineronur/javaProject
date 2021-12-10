package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("bir sayi gireceksiniz: ");
    	int sayi=scan.nextInt();
    	
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(1);
    	int topla=0;
    	for (int i =0; i < sayi; i++) {
			topla=list.get(i)+list.get(i+1);
			list.add(topla);
		}System.out.println(list);
    }
}
