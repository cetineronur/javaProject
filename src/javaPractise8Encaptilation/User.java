package javaPractise8Encaptilation;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	private int id;
	
	private String username;
	
	private String password;
	private boolean active=true;
	private boolean signedIn=false;
	
	ArrayList<String> userName = new ArrayList<>();
	ArrayList<String> passWord = new ArrayList<>();

	
	
	public void setId(int id) {
		this.id = id;
	}
	//User obj1=new User(password, password);
	
	public void setString(String password) {
		while(password.length()<6) {
			Scanner scan = new Scanner(System.in);
			System.out.println("password alti krakterden az olamaz tekrar giriniz: ");
			 password =scan.next();			 
		}
		this.passWord.add(password);
	}
	
	public User (String name,String password) {
		
		setString(password);
		this.userName.add(name);
		
	}
}
