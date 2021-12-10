package tag23;

import java.util.Arrays;

public class multiDimensional2_bitmedi {

	public static void main(String[] args) {
		/*Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
		elemanlarin toplamini ekrana yazdiran bir program yaziniz. 
		(Zor soru) arr1 = { {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }  */
		
		int[][] nummer1 = { {1,2},   {3,4,5}, {6} };
		int[][] nummer2 = { {7,8,9}, {10,11}, {12} };
		int[][] bos		= new int[3][3];
		
		for (int i = 0; i < nummer1.length; i++) {
			for (int j = i; j < nummer2[i].length; j++) {
					bos[i][j]=nummer1[i][j]+nummer2[i][j];
					if(j==nummer2.length-1) {
						bos[i][nummer2.length-1]=nummer2[i][nummer2.length-1];
					}
				
			}
		}System.out.println(Arrays.toString(bos));
	
	
	
	}
}