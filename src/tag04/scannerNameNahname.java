package tag04;
import java.util.Scanner;
public class scannerNameNahname {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("bitte geben Sie Ihren Name ein:");

		String isim = scan.next();

		System.out.println(isim);
		scan.close();


	}

}
