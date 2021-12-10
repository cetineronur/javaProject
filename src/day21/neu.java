package day21;

import java.util.Scanner;

public class neu {

	public static void main(String[] args) {
		/*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını 
		 * sorarak verilen formata ceviren java kodunu yaziniz.
		Input :
		John White
		1234234534561478
		Output : Name :
		J* W**
		CCN : ** ** **** 1478
		Ilk Harfler Buyuk harf ile baslamalidir. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz: ");
		String name = scan.nextLine();
		System.out.println("soyadinizi giriniz: ");
		String nahName = scan.nextLine();
		System.out.println("Kredi karti numaranizi giriniz : ");
		String kartno = scan.next();
		
		int length=name.length();
		int length1=nahName.length();
		System.out.println("Adiniz ve Soyadiniz: "+name.toUpperCase().charAt(0)+name.substring(1,2).replaceAll("\\w","*")+" "+nahName.toUpperCase().charAt(0)+nahName.toLowerCase().substring(1,3).replaceAll("\\w", "*"));
		System.out.println("CCN: "+kartno.substring(0,2).replaceAll("\\d","*")+" "+kartno.substring(2,4).replaceAll("\\d","*")+" "+kartno.substring(4,8).replaceAll("\\d","*")+" "+kartno.substring(8,12));
		
		}
		
	}

