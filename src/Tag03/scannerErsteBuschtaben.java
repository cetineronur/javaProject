package Tag03;
import java.util.Scanner;
public class scannerErsteBuschtaben {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihren Name ein");
		char Ad= scan.next().charAt(0);
		
		System.out.println("Der erste Buschtaben des Names: "+Ad);
		scan.close();	
	}

}
