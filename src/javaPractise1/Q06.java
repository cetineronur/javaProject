package javaPractise1;
import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
       /* kullanıcıdan bir e-posta adresi girmesini isteyin, 
       ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
       örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Ihre E-Mail Adresse ein");
        String email = scan.next();
       
    	if (email.contains("hotmail")) {
			System.out.println("Ihre Neue E-mail Adresse: "+email.replace("hotmail", "gmail"));
		}else if(email.contains("gmail")){
			System.out.println("Bitte geben Sie Hotmail Adresse ein");
		}
    	scan.close();
    }
}
