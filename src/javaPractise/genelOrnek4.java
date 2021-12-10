package javaPractise;
import java.util.Scanner;
public class genelOrnek4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir rakam giriniz: ");
		double a = scan.nextDouble();
		System.out.print("Bir rakam daha giriniz: ");
		double b = scan.nextDouble();
		
		a+=b;
		System.out.println("toplam: "+a);
		a-=b;
		a-=b;
		System.out.println("Fark: "+a);
		a+=b;
		a*=b;
		System.out.println("carpma: "+a);
		a/=b;
	    a/=b;
		System.out.println("Bolme: "+a);
		scan.close();
	}
}
