package javaPractise1;
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Text ein");
    	String text = scan.nextLine();
       
       	System.out.println("Isim: " + text.substring(0,text.indexOf(" ")+1)); 
    	System.out.println("SoyIsim: " + text.substring(text.lastIndexOf(" ")+1)); 
    	
    	System.out.println("girilen string bos mu ?: "+text.isEmpty());
    	scan.close();
    }
}
