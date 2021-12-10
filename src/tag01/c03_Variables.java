package tag01;
public class c03_Variables {
	public static void main(String[] args) {
		int nummer1=10;
		int nummer2=20;
		
		String nummer3="10";
		String nummer4="20";
		System.out.println(nummer1+nummer2); // 30
		System.out.println(nummer3+nummer4); //1020
		
		String buschtaben1="A";
		char buschtaben2='A';
		
		System.out.println(nummer1+nummer2+buschtaben1);//30A
		System.out.println(nummer1+nummer2+buschtaben2);//95
		System.out.println(buschtaben1+nummer1+nummer2);//A1020
		System.out.println(nummer1+buschtaben1+nummer2);//10A20
		System.out.println((nummer1+nummer2)+buschtaben1);//30A
	}

}
