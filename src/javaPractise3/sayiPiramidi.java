package javaPractise3;

import java.util.Scanner;

public class sayiPiramidi {

	public static void main(String[] args) {

//      1 2 3 4 5 6
//       2 3 4 5 6
//        3 4 5 6
//         4 5 6
//          5 6
//           6       şeklini konsola yazdiriniz.
		
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen bir sayi giriniz:");
	int satirsayisi=scan.nextInt();
	
	for (int i = 0; i<=satirsayisi; i++) {
		for (int j = satirsayisi; j<satirsayisi-(i+1); j++) {
			System.out.print(" ");
		}
		for (int j = i+1; j<=satirsayisi; j++) {
			System.out.print(j+" ");
		}System.out.println();
	}
		
		scan.close();

	}

}
