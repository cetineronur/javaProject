package javaPractise1;
public class Q11 {
    public static void main(String[] args) {
	/*
	Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
	String  pickName = "ABCDEFGHiJKLMNOPQRSTUVWXYZ";
	*/
    	String  pickName = "ABCDEFGHiJKLMNOPQRSTUVWXYZ";	
    	System.out.println(pickName.charAt(pickName.indexOf("A"))+" "+pickName.charAt(pickName.indexOf("L"))+" "+pickName.substring(8, 9).toLowerCase());
       
    }

}
