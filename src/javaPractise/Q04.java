package javaPractise;
import java.util.Scanner;
public class Q04 {
	public static void main(String[] args) {
		/* Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager  yazdiriniz */

	Scanner scan = new Scanner(System.in);
	System.out.println("qa\ndev\nba\npm\n");
	String meslek = scan.next();
	String Qa="Quality Analyst";
	String dev="Developer";
	String ba="Busines Analyst";
	String pm="Project Manager";
	
	if (meslek.toLowerCase().equals("qa")) {
		System.out.println("mesleginiz: "+Qa);
	}else if (meslek.toLowerCase().equals("dev")){
		System.out.println("mesleginiz: "+dev);
	}else if (meslek.toLowerCase().equals("ba")) {
		System.out.println("mesleginiz: "+ba);
	}else if (meslek.toLowerCase().equals("pm")) {
		System.out.println("mesleginiz: "+pm);
	}scan.close();
	}
}
