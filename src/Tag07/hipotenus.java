package Tag07;

import java.util.Scanner;

public class hipotenus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ucgenin 1.kenar uzunlugunu giriniz: ");
		double kenar1 = scan.nextInt();
		
		System.out.println("ucgenin 2.kenar uzunlugunu giriniz: ");
		double kenar2 = scan.nextInt();
		
		double hipotenus= Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2));

		System.out.println("Hipetenus: "+hipotenus);
	}

}
