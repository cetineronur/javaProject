package tag33_stringBuilder;

public class c02_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("jaaa");
		StringBuilder sb2 = new StringBuilder("jaza");
		
		System.out.println(sb1==sb2);		 // false
		System.out.println(sb1.equals(sb2)); // false
		
		System.out.println(sb1.compareTo(sb2));//0
		
		StringBuilder sb3 = new StringBuilder("java ogrendik");
		//araya "cok iyi" ekleyelim.
		
		sb3.insert(4, "yi cok iyi");
		System.out.println(sb3);
		
		System.out.println(sb3.insert(0, "cok cok cok",4,7));

	}

}
