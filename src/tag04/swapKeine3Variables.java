package tag04;
public class swapKeine3Variables {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Ilkonce: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("sonra: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
