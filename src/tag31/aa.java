package tag31;

import java.util.*;

public class aa {

	public static void main(String[] args) {
		/*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

		input : ade1r4d3

		output : 8

		     Hint :
		     Use Character.isDigit()
		     Integer.valueOf()*/
		
		String input="ade1r4d3";
		//char array = input.split("");
		String bos = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))==true) {
				bos+=input.charAt(i);
			}	
		}System.out.println(bos);
		
		int bos1=0;
		for (int i = 0; i <bos.length() ; i++) {
			
			bos1+=Integer.valueOf(bos.substring(i, i+1));
		}System.out.println(bos1);
	}

}
