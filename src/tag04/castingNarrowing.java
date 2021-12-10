package tag04;
import java.util.Scanner;
public class castingNarrowing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Variable im Double-Typ ein: ");
		double a = scan.nextDouble();
		
		int b = (int)a;
		byte c= (byte) b;
		
		System.out.println("integer: "+b);
		System.out.println("byte  : "+c);
		scan.close();
	}
}
