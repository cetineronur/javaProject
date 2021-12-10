package javaPractise8Encaptilation;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("username giriniz:");
		String name = scan.next();

		System.out.println("password giriniz: ");
		String password = scan.next();
		User obj = new User(name, password);

		System.out.println(obj.userName);
		System.out.println(obj.passWord);

	}

}
