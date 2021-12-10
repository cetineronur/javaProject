package tag23;

public class arrays1 {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
		// yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		
		int[][] nummern = { {1,2}, {4,5},{3,4,5},{1,2} };
		
		int carpim=1;
	
		System.out.println(carpim(nummern,carpim));
	}

	private static int carpim(int[][] nummern, int carpim) {
		for (int i = 0; i < nummern.length; i++) {
			for (int j = 0; j < nummern[i].length; j++) {
				carpim*=nummern[i][j];
			}
		}//System.out.println(carpim);
		return carpim;
		}
}
