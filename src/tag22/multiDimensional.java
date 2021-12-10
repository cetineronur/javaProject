package tag22;

import java.util.Arrays;

public class multiDimensional {

	public static void main(String[] args) {
		int[][] nummern= { {1,2},{3,4},{5,6} };
		
		for (int i = 0; i < nummern.length; i++) {
			for (int j = 0; j < nummern[i].length; j++) {
				System.out.print(nummern[i][j]+" ");
			}
		}System.out.println();
		System.out.print(Arrays.deepToString(nummern));

	}

}
