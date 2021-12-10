package tag04;

import java.util.Scanner;

public class preIncrement {
	public static void main(String[] args) {
	int c=6;
	Scanner scan = new Scanner(System.in);
	System.out.println("bitte geben Sie eine Nummer ein: ");
	int a = scan.nextInt();
	System.out.println("bitte geben Sie noch eine Nummer ein:");
	int b= scan.nextInt();
	c++;
	c=a*b;
	c++;
	c++;
	int e=5;
	e += 5;
	System.out.println(c++);
	//int d=c;
	System.out.println(c);
	System.out.println(e);
	scan.close();
	
	}
}
