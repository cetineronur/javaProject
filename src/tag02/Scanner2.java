package tag02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi yaziniz");
		String Ad = scan.nextLine();
		System.out.println("Isminiz: "+Ad);
	}

}
