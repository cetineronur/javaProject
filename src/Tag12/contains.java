package Tag12;

import java.util.Scanner;

public class contains {

	public static void main(String[] args) {
		
		        //  Soru 1) Kullanicidan email adresini girmesini isteyin, 
		        //         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, 
		        //         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , 
		        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin 
		        
		Scanner scan = new Scanner(System.in);
		System.out.println("email adresinizi giriniz");
		String email = scan.nextLine();
		int length = email.length();
		int index = email.indexOf("@gmail.com");
		
		boolean contains =email.contains("@gmail.com");
		
		String myString = "Merhaba dunya";
		System.out.println(myString.substring(0, 7));//mystringdeki 0 dan 7?ye kadarki krakterleri yan yana yazdirdi.
				
		if (contains==false) {
			System.out.println("Lutfen gmail adresi giriniz");
		}else if (length>10 && index==length-10) {
			System.out.println("Email adresiniz kaydedildi");
		}else {
			System.out.println("lutfen yazimi kontrol edin");
		}
		scan.close();
		    }
		}
	















