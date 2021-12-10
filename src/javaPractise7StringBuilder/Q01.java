package javaPractise7StringBuilder;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	StringBuilder input = new StringBuilder("ey edip adanada pide ye");
    	String input2=input.toString();
    	String input1=input.reverse().toString();
    
    	if (input1.equalsIgnoreCase(input2)) {
			System.out.println("it is a Polindrome");
		}else {
			System.out.println("it is not Palindrom");
		}

    	

    }

}
