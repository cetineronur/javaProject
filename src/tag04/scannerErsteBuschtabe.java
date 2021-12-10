package tag04;
import java.util.Scanner;
public class scannerErsteBuschtabe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bitte geben Sie Ihren Name ein: ");
		
		char ad = scan.nextLine().charAt(0);
		
		System.out.println("Anfangsbuchstabe deines Namens: "+ad);
	}
}
