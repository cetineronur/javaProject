package Tag03;

import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cemberin yaricapini giriniz");
		double Yaricap = scan.nextDouble();
		
		double cevre = 2*3.14*Yaricap;
		double alan = 3.14*Yaricap*Yaricap;
		
		System.out.println("Cemberin Cevresi: "+cevre + "  Dairenin alani: "+alan);

	}

}
