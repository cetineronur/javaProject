package javaPractise5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
		 * alin.
		 * input : Congratulations
		 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

		 */
		
		
		String cumle = "Congratulations";
		
		String[] cumle1=cumle.split("");
		System.out.println(Arrays.toString(cumle1));
		for (int i = 0; i < cumle1.length; i++) {
			if (cumle1[i].contains("o")||cumle1[i].contains("a")||cumle1[i].contains("u")) {
				cumle1[i]="i";
			}
		}System.out.println(Arrays.toString(cumle1));
		
		String cumle2="";
		
		for (int i = cumle1.length-1; i >=0 ; i--) {
			cumle2+=cumle1[i];
		}System.out.println(cumle2);
		
		
		
		
		
	}

}
