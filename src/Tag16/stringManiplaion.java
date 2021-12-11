package Tag16;
import java.util.Scanner;
public class stringManiplaion {
	public static void main(String[] args) {
	 
		/*1. Uc sayi giriniz. En büyük ve en kücük sayiyi yazdiriniz.
		2. En az 10 karakterden olusan bir karakter dizimi giriniz. 
		Bu karakter diziminin 3. karakterinden baslayarak 8. karakteri 
		dahil aradaki karakterlerin ASCII degerleri toplamini yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie ein Zahl ein");
    	int nummer1 = scan.nextInt();
    	System.out.println("Bitte geben Sie noch ein Zahl ein");
    	int nummer2 = scan.nextInt();
    	System.out.println("Bitte geben Sie noch ein Zahl ein");
    	int nummer3 = scan.nextInt();
    	
    	if ((nummer1>nummer2)&&(nummer1>nummer3)) {
			System.out.println("am größten Zahl: "+nummer1);
			
		}else if((nummer2>nummer1)&&(nummer2>nummer3)) {
			System.out.println("am größten Zahl: "+ nummer2);
		}else {
			System.out.println("am größten Zahl: "+ nummer3);
		}
    	if (condition) {
			
		}
		*/
		Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie ein text ein. aber es sollte zehn karakter sein.");
    	String text = scan.nextLine();
    	if (!text.contains(" ")) {
			char dritte=text.charAt(3);
	    	char vierte=text.charAt(4);
	    	char funfte=text.charAt(5);
	    	char sechste=text.charAt(6);
	    	char siebte=text.charAt(7);
	    	char achte=text.charAt(8);
	    	System.out.println(dritte);
		System.out.println("zwichen dritte und achte karakter im text gegen ASCI code: "+ (dritte+vierte+funfte+sechste+siebte+achte));
		
    	}else if(text.contains(" ")) {
			text=text.replaceAll(" ", "");
			char dritte=text.charAt(3);
	    	char vierte=text.charAt(4);
	    	char funfte=text.charAt(5);
	    	char sechste=text.charAt(6);
	    	char siebte=text.charAt(7);
	    	char achte=text.charAt(8);
	    	System.out.println(" "+dritte);
	    	
	    	System.out.println("zwichen dritte und achte karakter im text gegen ASCI code: "+ (dritte+vierte+funfte+sechste+siebte+achte));
		}
    	
    	scan.close();
    	

	}

}
