package Tag19;

import java.util.Scanner;

public class forLoop2 {

	public static void main(String[] args) {
		//kullanicidan 2 tam sayi isteyin
		// ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
		// (ikinci sayi dahil olmak zorunda degil)


		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Zahl ein: ");
		int zahl1 = scan.nextInt();
		System.out.println("Bitte geben noch Sie ein Zahl ein: ");
		int zahl2 = scan.nextInt();
		
		if (zahl1>zahl2) {  //azalarak gidecek
			for (int i = zahl1; i>=zahl2; i-=3) {
				System.out.print(i + " ");
			}
			
		}else if(zahl1<zahl2) { //artarak gidecek
			for (int i = zahl1; i <=zahl2; i+=3) {
				System.out.print(i + " ");
			}
			
		}else {
		System.out.println("girilen sayilar esit.");	
		}
		scan.close();
		
	}

}
