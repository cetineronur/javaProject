package tag02;

public class swap2 {

	public static void main(String[] args) {
		int a=15,b=500;
		System.out.println("swaptan once: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		System.out.println("swaptan sonra: ");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
