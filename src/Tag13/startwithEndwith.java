package Tag13;

import java.util.Scanner;

public class startwithEndwith {

	public static void main(String[] args) {
	String str = "calisirsaniz, java ogrenmek kolay";
	System.out.println(str.endsWith("a"));
	System.out.println(str.startsWith("c"));
	System.out.println(str.startsWith("java", 14 ));
	
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen bir cumle giriniz");
	String cumle = scan.nextLine();
	System.out.println("lutfen bir kelime giriniz");
	///boolean kelime = scan.next();
	
	if (cumle.startsWith(cumle)) {   //girdiginiz kelime ile basliyor mu
		System.out.println("girdiginiz kelime ile baslar.");
	}else {
		System.out.println("girdiginiz kelime ile baslamiyor");
	}
	
	if (cumle.endsWith(cumle)) {  // girdiginiz kelime ile bitiyor mu
		System.out.println("girdiginiz kelime ile biter");
	}else {
		System.out.println("girdiginiz kelime ile bitmiyor");
	}
	scan.close();
	
		}

	}


