package javaPractise1;
import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        // Bitten Sie den Benutzer nach einem Wort mit 4 Buchstaben und kehren Sie das eingegebene Wort um
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Text ein");
    	String text = scan.nextLine();
    	
    	char a =text.charAt(0);
    	char b =text.charAt(1);
    	char c =text.charAt(2);
    	char d =text.charAt(3);
    	
    	System.out.print(""+d+c+b+a);
    	scan.close();
    }
}
