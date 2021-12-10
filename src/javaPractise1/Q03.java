package javaPractise1;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Ihre Name und Nahname ein");
    	String input = scan.nextLine();
    	
    	char erstebuschtaben = input.toUpperCase().charAt(0);
    	char zweitebuschtaben = input.toUpperCase().charAt(input.indexOf(" ")+1);
    	char drietetebuschtaben = input.toUpperCase().charAt(input.lastIndexOf(" ")+1);
    	
    	System.out.println("Ihre Initialen: "+erstebuschtaben+"."+zweitebuschtaben+"."+drietetebuschtaben);
    	scan.close();
    }       
}
