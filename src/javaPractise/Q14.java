package javaPractise;
import java.util.Scanner;
public class Q14 {  
	public static void main(String[] args) {
		/* Günün sorusu: if statement
      	katsayıları verilen 2 bilinmeyenli denklemin köklerini bulunuz.
        ax^2 + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d))/(2a)  , x2= (-b - kök(d))/(2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
		Scanner scan = new Scanner(System.in);
    	System.out.println("a sayisini giriniz");
    	int a = scan.nextInt();
    	System.out.println("b sayisini giriniz");
    	int b = scan.nextInt();
    	System.out.println("c sayisini giriniz");
    	int c = scan.nextInt();
    	int delta=(b*b)-(4*a*c);
    	double d=Math.sqrt(delta);
    	//(a*Math.pow(x, 2))+(b*x)+c=0;
    	double x=(((-b+Math.sqrt((b*b))-(4*a*c)))/(2*a));
    	
    	if (delta>0) {
			System.out.println("1.kok: "+x);
			x=((b+Math.sqrt((b*b)-(4*a*c)))/(2*a));
			System.out.println("2.kok: "+x);
		}else if (d==0) {
			System.out.println("kok: "+(-b/(2*a)));
		}else {
			System.out.println("kok yoktur. kusura bakma");
		}
    	scan.close();
      }}
