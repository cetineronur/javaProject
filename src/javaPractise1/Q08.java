package javaPractise1;
import java.util.Scanner;
public class Q08 {
    public static void main(String[] args) {
        /*Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         * ornek
         * input = Ali
         * output = lilili
         * input = el
         * output = el
         */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie ein Wort ein");
    	String wort = scan.next();
    	int length = wort.length();
    	
    	if (wort.length()>=3) {
			System.out.println(wort.substring(length-2)+wort.substring(length-2)+wort.substring(length-2));
		}else if (length<3) {
			System.out.println(wort);
		}
    	scan.close();
    }
}
