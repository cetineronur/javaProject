package tag04;
public class swap {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Ilkonce:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		int c=a;
			a=b;
			b=c;
		System.out.println("Sonra: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
