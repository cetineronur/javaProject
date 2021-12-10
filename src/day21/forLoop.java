package day21;
import java.util.Scanner;
public class forLoop {
	public static void main(String[] args) {
		/*girilen bir string icinde tekrarlayanlari bulur.*/
		
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir kelime giriniz : ");
		String kelime = scan.nextLine();
 
    String tekrarlayan="";
 
    for (int i = 0; i < kelime.length(); i++) {
			if (kelime.substring(i+1).contains(kelime.substring(i, i + 1))) {
				if (!tekrarlayan.contains(kelime.substring(i, i+1))) {
					tekrarlayan = tekrarlayan + kelime.charAt(i)+", ";
				}
			}
		}
		System.out.println(tekrarlayan);
		
		scan.close();
	}
}
