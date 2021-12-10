package javaPractise;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("1.sayiyi giriniz: ");
    	int a = scan.nextInt();
    	System.out.print("2.sayiyi giriniz: ");
    	int b = scan.nextInt();
    	System.out.print("3.sayiyi giriniz: ");
    	int c = scan.nextInt();  
        
    	if (a>b&&b>c) {
			System.out.println("En buyuk olani: "+a);
			System.out.println("En kucuk olani: "+c);
		}else if (b>a&&a>c) {
			System.out.println("En buyuk olani: "+b);
			System.out.println("En kucuk olani: "+c);
		}else if (c>b&&b>a) {
			System.out.println("En buyuk olani: "+c);
			System.out.println("En kucuk olani: "+a);
		}else if (a>c&&c>b) {
			System.out.println("En buyuk olani: "+a);
			System.out.println("En kucuk olani: "+b);
		}else if (b>c&&c>a) {
			System.out.println("En buyuk olani: "+b);
			System.out.println("En kucuk olani: "+a);
		}else if (c>a&&a>b) {
			System.out.println("En buyuk olani: "+c);
			System.out.println("En kucuk olani: "+b);
		}else if (a>b&&b==c) {
			System.out.println("En buyuk olani: "+a);
			System.out.println("2. ve 3. sayi birbirine esitir.");
		}else if (b>a&&a==c) {
			System.out.println("En buyuk olani: "+b);
			System.out.println("2. ve 3. sayi birbirine esitir.");
    }
    	scan.close();
    	}
}

