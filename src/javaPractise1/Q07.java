package javaPractise1;
import java.util.Scanner;
public class Q07 {
    public static void main(String[] args) {
        /*Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Ihre Name ein");
    	String name = scan.next();
    	int length = name.length();
    	System.out.println("*********if ile cozum**********");
    	
    	char c1=name.charAt(0);//erste Buschtabe
    	char c2=name.charAt(1);//zweite Buschtabe
    	char c3=name.charAt(2); //driete Buschtabe 
    	if (length==3) {
			if (c1!=c2 && c2!=c3 && c1!=c3) {
				System.out.println("girilen isim 3 harfli ve unique");
			}else {
				System.out.println("girilen 3 harfli ama unique degil");
			}
			}else {
    		System.out.println("girilen isin 3 harfli degildir");
    	}
    	
    	System.out.println("*********turnary ile cozum**********");
    	
    System.out.println(length==3?(c1!=c2 && c2!=c3 && c1!=c3)?"girilen isim 3 harfli ve unique":"girilen 3 harfli ama unique degil":"girilen isin 3 harfli degildir");
    		scan.close();    
    }
}