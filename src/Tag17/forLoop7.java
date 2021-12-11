package Tag17;
import java.util.Scanner;
public class forLoop7 {
	public static void main(String[] args) {
		//Kullanicidan bir String isteyin ve Stringi tersine ceviren
		//bir program yazin.
		Scanner scan = new Scanner(System.in);
		System.out.println("bir yazi giriniz");
		String text1= scan.nextLine();
		int length=text1.length();
				
		System.out.println(ters(text1,length));
		scan.close();
		}
	public static String ters(String text1, int length) {
		String ters="";
		
		for (int i = length-1; i>=0 ; i--) {
			
			ters+=text1.substring(i, i+1);
		}
		return ters;
		
	}
}
