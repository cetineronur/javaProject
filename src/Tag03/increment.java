package Tag03;
public class increment {
	public static void main(String[] args) {
		int a= 10, b=9, e=8;
		e*=3;
		e++;
		int c=a*++b;
		int d= ++a;
		System.out.println(c+d);
		System.out.println(e);
	}
}
