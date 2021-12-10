package javaPractise6_List._10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10 {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("kac sayi gireceksiniz: ");
    	int sayi=scan.nextInt();
    	List<Integer> list = new ArrayList<>();
    	int count=0;
    	while(count<sayi) {
    		System.out.println(count+1+".sayiyi giriniz");
    		int sayi1=scan.nextInt();
    		list.add(sayi1);
    		count++;
    	}
    	
    	List<Integer> list1 = new ArrayList<>();
    	list1.add(list.get(0));
    	
    	if (sayi<11) {
			
    	int topla=0;
    	int i=1;
    	while(i<sayi-7) {
    		
    		topla+=list.get(i);
    		i++;
    	}
    	list1.add(topla);
    	
    
    	topla=0;
    	while(i<6) {
    		
    		topla+=list.get(i);
    		i++;
    	}list1.add(topla);
    	
    	
    	topla=0;
    	while(i<10) {
    		
    		topla+=list.get(i);
    		i++;
    	}list1.add(topla);
    	
    	System.out.println(list1);
    	}else {
    		
    	}
    	
    }
}
