package Tag07;

public class wrapper {
public static void main(String[] args) {
	int a= 10;
	Integer sayi2=20;
	//sayi1. yazdigimizda hicbir metod cikmaz. cunku sayi1. int'dir. yani primitive dir.
	// sayi2. yazdigimizda ise bircok metod gelir. cunku Integer dir. Wrapper class dir.
	String tel1="2578987";
	String tel2="3245434";
	System.out.println(tel1+tel2); // 25789873245434 cikar.
	
	// bu sayilari toplamak istersek 
	System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
	System.out.println(Double.MAX_VALUE);// double in maximumu 1.7976931348623157E308
	System.out.println(Short.MIN_VALUE); //short un en KUCUK alacagi degerdir.
	
	String caddeNo="203";
	String sokakNo="1564";
	
	System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
	
	System.out.println("hello world");
	}
}
