package tag02;

import java.util.Scanner;
public class DaireAlani {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Yaricapi giriniz");
	int yaricap=scan.nextInt();
	
	System.out.println("Cemberin Cevresi: "+ (2*3.14*yaricap));
	System.out.println("Daire'nin alani: "+ (3.14*yaricap*yaricap));
	
	}

}
