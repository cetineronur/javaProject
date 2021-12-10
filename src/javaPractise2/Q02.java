package javaPractise2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Bir text giriniz\n entera basin");
    	String a = scan.next();
    	String b = scan.next();
    	int length=a.length();
    	concat(a,b,length);
    	scan.close();
 }
	private static void concat(String a, String b, int length) {
		if (length%2==0) {
			System.out.println(a.substring(0,(length/2)).concat(b)+a.substring(length/2));
		}else {
			System.out.println("text cift sayili olmadigi icin ortasina yerlestiremedik");
		}
	}
}
