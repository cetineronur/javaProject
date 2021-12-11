package Tag10;
import java.util.Scanner;
public class turnary3 {
	public static void main(String[] args) {
		//Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girin: ");
		int sayi = scan.nextInt();
		
		System.out.println((sayi%2==0 &&sayi!=0) ? "sayi cifttir":((sayi<=0 ||sayi==-0)? "negatifin ve sifirin pozitif yada negatifi olmaz":"sayi tektir"));

	
	if (sayi%2==0 && sayi!=0) {
		System.out.println("sayi ciftir.");
	}else if (sayi<=0 || sayi==-0) {
		System.out.println("negatifin ve sifirin pozitif ve negatifi olmaz");
	}else {
		System.out.println("sayi tektir");
	}
	scan.close();
	}

}
