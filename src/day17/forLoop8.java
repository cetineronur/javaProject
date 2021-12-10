package day17;
import java.util.Scanner;
public class forLoop8 {
	public static void main(String[] args) {
		//Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
	   //palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir yazi giriniz");
		String text1= scan.nextLine();
		int length=text1.length();
		
		if (text1.equals(ters(text1,length))) {
			System.out.println("girdiginiz String palindrom");
		}else {
			System.out.println("girdiginiz String palindrome degil");
		}scan.close();
	}
	private static Object ters(String text1, int length) {
		String ters="";
		
		for (int i = length-1; i>=0 ; i--) {
			
			ters+=text1.substring(i, i+1);
		}
		return ters;
	}

}
