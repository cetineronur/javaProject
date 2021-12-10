package javaPractise2;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("icinde xyz var mi kontrol etmek icin bir cumle giriniz:");
    	String cumle = scan.next();
    	
    	varMi(cumle);
    	System.out.println("girdiginiz cumlenin icinde xyz: "+varMi(cumle));
    	scan.close();
    }

	public static boolean varMi(String cumle) {
		boolean kontrol=cumle.contains("xyz");
		
		return kontrol;
		
	}

}
