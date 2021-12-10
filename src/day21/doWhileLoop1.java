package day21;

public class doWhileLoop1 {

	public static void main(String[] args) {
		// ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
		
		for (char i = 109; i>98; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		char i=109;
		while (i>98) {
			System.out.print(i+" ");
			i--;
		}
		
		System.out.println();
		
		char j=109;
		do {
			System.out.print(j+" ");
			j--;
		} while (j>98);
	}

}
