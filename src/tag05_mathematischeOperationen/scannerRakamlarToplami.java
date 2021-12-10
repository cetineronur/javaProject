package tag05_mathematischeOperationen;
import java.util.Scanner;
public class scannerRakamlarToplami {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 basamkli bir sayi yaziniz");
		int a=scan.nextInt();
		int rakamtop=0;
		int rakam=a%10;
		rakamtop+=rakam;
		
		a/=10;
		rakam=a%10;
		rakamtop+=rakam;
		
		a/=10;
		rakamtop+=a;
		System.out.println("girdiginiz sayinin rakamlar toplami: "+rakamtop);
		scan.close();
	}

}
