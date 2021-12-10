package tag04;
import java.util.Scanner;
public class IntegerDoubleSayiBolme {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Integer bir sayi girin: ");
		int a= scan.nextInt();
		
		System.out.println("Double bir sayi girin: ");
		double b=scan.nextDouble();
		
		 System.out.println("Bolum: "+(a/b));
		double c= a/b;
		//scan.close();
		int d =(int) c;
		System.out.println("yuvalanmis hali: " +d);
	}
}
