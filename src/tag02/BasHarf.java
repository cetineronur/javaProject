package tag02;
import java.util.Scanner;
public class BasHarf {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Adinizi Giriniz");
	char c  = scan.nextLine().charAt(0);
	
	System.out.println("Isminin Bas Harfi: " +c);
	}
}
