package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    	
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	System.out.println("lutfen bir deger giriniz: ");
    	String a=scan.next();
    	@SuppressWarnings("unused")
		int count=0;
    	while (!a.equals("x")) {
    		
    	System.out.println("lutfen bir deger giriniz: ");
      	a=scan.next();
      	count++;
       	System.out.println("Program calisiyor");   		
     
    	}System.out.println("Program bitti.");
    	
    }
}

