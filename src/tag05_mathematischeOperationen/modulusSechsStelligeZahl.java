package tag05_mathematischeOperationen;
import java.util.Scanner;
public class modulusSechsStelligeZahl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte schreiben Sie eine 6-stellige Zahl");
		int a=scan.nextInt();
		int rakamtop=0;
		int rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		System.out.println("Ziffernsumme der eingegebenen Zahl: "+rakamtop);
		scan.close();
	}
}
