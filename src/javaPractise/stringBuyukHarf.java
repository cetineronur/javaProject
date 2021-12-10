package javaPractise;
import java.util.Scanner;
public class stringBuyukHarf {
	public static void main(String[] args) {
		//YAZDIGIMIZ STRING DE KI BUYUK HARFLERI KUCUK HARF,
		//KUCUK HARFLERI BUYUK HARF YAPMA
		Scanner scan=new Scanner (System.in);
		System.out.println("5 harflik bir kelime yaziniz.");
		String cumle=scan.nextLine();
		int sayi = cumle.length();
		if (sayi!=5) {
		System.out.println("Lutfen bes harflik kelime girin.");	
		}else {
		
		  char a = cumle.charAt(0);//Kelimenin ilk harfini aldik
		  cumle=cumle.substring(1);//kelimenin ilk harfini attik
		  char b = cumle.charAt(0); //kelimenin 2.harfini aldik
		  cumle=cumle.substring(1); //kelimenin 2.harfini attik
		  char c = cumle.charAt(0);
		  cumle=cumle.substring(1);
		  char d = cumle.charAt(0);
		  cumle=cumle.substring(1);
		  char e = cumle.charAt(0);
		  cumle=cumle.substring(1);
		  //System.out.println(""+a+b+c+d+e);
		  
		  if (a>=97 && a<=122){ // eger ilk harf kucukse 
			  String stra=a+""; //chari stringe cevirdim.
			  String strA=stra.toUpperCase(); //kucuk harfi buyuk harfe cevirdim
			  System.out.print(strA);
		}else {							// eger harf buyukse
			  String stra=a+"";
		      stra=stra.toLowerCase();
			  System.out.print(stra);	//buyuk harfi kucuk harfe cevirdim.
		}
		  if (b>=97 && b<=122){
			  String strb=b+"";
			  String strB=strb.toUpperCase();
			  System.out.print(strB);
		}else {
			  String strb=b+"";
			  strb=strb.toLowerCase();
			  System.out.print(strb);
		}
		  if (c>=97 && c<=122){	
			  String strc=c+"";
			  String strC=strc.toUpperCase();
			  System.out.print(strC);
		}else {
			  String strc=c+"";
			  strc=strc.toLowerCase();
			  System.out.print(strc);
		}
		  if (d>=97 && d<=122){	
			  String strd=d+"";
			  String strD=strd.toUpperCase();
			  System.out.print(strD);
		}else {
			  String strd=d+"";
			  strd=strd.toLowerCase();
			  System.out.print(strd);
		}
		  if (e>=97 && e<=122){	
			  String stre=e+"";
			  String strE=stre.toUpperCase();
			  System.out.print(strE);
		}else {
			  String stre=e+"";
			  stre=stre.toLowerCase();
			  System.out.print(stre);
		}
		}
		  // cumle = c + cumle . substring ( 1 );//  1.karakteri atar ve buyuttugumuz karakerle birlestirir.
	  
	}
}
