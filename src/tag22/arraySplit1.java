package tag22;

import java.util.Arrays;

public class arraySplit1 {

	public static void main(String[] args) {
		// "java ogrendim,  #cok para ?kazandim.,"
		// cumleinin kelimelerioni, ozel krakterler ve noktalama isaretleri olmadan 
		//harf sirasina gore yazdirin.
		
		String cumle = "Java ogrendim,  #cok para ?kazandim.,";
		
		String arr1[]=cumle.split(" ");
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=arr1[i].replaceAll("\\W","");
			
		}
		System.out.println(Arrays.toString(arr1));// string olarak yazdirma
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
