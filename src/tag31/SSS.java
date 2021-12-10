package tag31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SSS {
	
	 
	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string.(Ignore case sensitivity).

		Input : Learning java is easy

		Output: maximum occurring character is : a*/
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir stringi girin");
		String str = scan.nextLine();
		String arr[] = str.split("");
		
		int maxsayac = 0;
		int sayac = 0;
		String enCok = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if (arr[i].equalsIgnoreCase(arr[j])) {
					sayac++;
		}
			}
				if (sayac>maxsayac) {
					maxsayac=sayac;
					enCok=arr[i];
					
				}else if (sayac==maxsayac) {
					
					enCok+=","+arr[i];
				}
			sayac=0;
		}
		System.out.println(enCok);
		
	}}
	/*
		String input ="Learning java is easy";
		String[] array =	input.split("");
		//List<String> list = new ArrayList<>(Arrays.asList("Learning java is easy"));
		List<String> list = new ArrayList<>();
		List<String> bos = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}//System.out.println(list);
		
		int max=0;
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).equalsIgnoreCase(list.get(j))) {
					count++;				
				}
			}
			if (count>max) {
				max=count;
				//bos.add(list.get(i));
				bos.set(0, list.get(i));
			}else if(count==max) {
				bos.add(list.get(i));
			}
			count=0;
		}System.out.println(bos);	
	}
}*/
