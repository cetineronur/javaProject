package Tag12;

public class equals {

	public static void main(String[] args) {
		int a=10;
		int b=a+0;
		
		System.out.println(a==b); //True
		
		char ch1='K';
		char ch2='K'+0;
		System.out.println(ch1==ch2); // true
		String str1 = "Ali";
		String str2 = "Can";
		String str3 = "Ali Can";
		String str4 = str1+" "+str2;
		String isim = null;
		
		System.out.println(str4);//Ali Can
		System.out.println(str3==str4);//false
		System.out.println(str3.equals(str4));//true
		
		System.out.println(str3.equalsIgnoreCase(str4));// true buyuk kucuk krakter farkliligi olmaksizin karsilastirir.
		//System.out.println(isim.length());
		String str5 = "calisirsaniz java ogrenmek kolay";
		System.out.println(str5.indexOf('s'));//4
		System.out.println(str5.indexOf("j"));//13
		
		int index=str5.indexOf("r");
		System.out.println(index);//6
		System.out.println(str5.indexOf('t'));	// -1
		System.out.println(str5.indexOf("java"));
		System.out.println(str5.indexOf('e',15));//22 15.krakterden sonraki e krarkterinin sirasini yazdirir.
		
		}

}
