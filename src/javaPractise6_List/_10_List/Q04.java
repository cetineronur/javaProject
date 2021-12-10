package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

    	Scanner input = new Scanner(System.in);
    	System.out.println("KAc ogrencinin notunu gireceksiniz: ");
    	int sayi=input.nextInt();
    	ArrayList<Integer> list = new ArrayList<>();
    	int count=0, not, toplam=0,ortalama;
    	
    	while(count<sayi ) {
    	System.out.println(count+1+". ogrecinin notunu giriniz: ");
    	not=input.nextInt();
    	toplam+=not;
    	list.add(not);
    	count++;
        	}System.out.println(list);
        	count=0;
        ortalama=toplam/sayi;
        for (int i = 0; i <list.size(); i++) {
			if (list.get(i)>=ortalama) {
				count++;
			}
		}System.out.println("Ortalamayi gecen ogrenci sayisi: "+count);
        	input.close();
    }
}
