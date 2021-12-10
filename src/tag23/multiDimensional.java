package tag23;

public class multiDimensional {

	public static void main(String[] args) {
		//Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
		//ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
		
		int[][] nummer= { {1,2,3}, {4,5}, {6} };
		
		int carpim=1;
		for (int i = 0; i < nummer.length; i++) {
			for (int j = nummer[i].length-1; j < nummer[i].length; j++) {
				carpim*=nummer[i][j];
			}
		}
		
		System.out.println(carpim);
	}

}
