package Tag21;

public class doWhileLoop {

	public static void main(String[] args) {
		// Geben Sie alle ganzen Zahlen von 9 bis 190 aus, die ein Vielfaches von 7 sind.
		
		int a=9;
		
		do {
			if (a%7==0) {
				System.out.print(a+" ");
				
			}a++;
		} while (a<190);
		
		

	}

}
