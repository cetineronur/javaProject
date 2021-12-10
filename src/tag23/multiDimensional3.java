package tag23;

import java.util.Arrays;
import java.util.Collections;

public class multiDimensional3 {

	public static void main(String[] args) {
		/*Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
		birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
		yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
		Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13} */
		

		int[][] nummer = { {1,2,3}, {4,5}, {6,7} };
		
		int topla=0, topla1=0, topla2=0;
		int [] yeni = new int[nummer.length];
		
		for (int i = 0; i <nummer.length; i++) {
			for (int j = 0; j <nummer[i].length; j++) {
				if (i==0) {
					topla+=nummer[i][j];
					yeni[0]=topla;
				}else if(i==1) {
					topla1+=nummer[i][j];
					yeni[1]=topla1;
				}else if (i==nummer.length-1){
					topla2+=nummer[i][j];
					yeni[2]=topla2;
				}
			}
		}System.out.println(Arrays.toString(yeni));
	}
}
