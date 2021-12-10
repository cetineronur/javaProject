package javaPractise1;
public class Q05 {
    public static void main(String[] args) {
    /*Finden Sie die Summe der unten angegebenen Preise als String.
       Saitenstr 1= 13,99%
       Saitenstr 2 = 10,55%
       Tipp: Sie können die Methode Double.parseDouble() verwenden.
     */
    	String  str1= "%13.99";
        String  str2= "%10.55";
        
        str1=str1.replace("%", "");System.out.println(str1);
        str2=str2.replace("%", "");
       System.out.println("sayilarin toplami: "+(Double.valueOf(str1)+Double.valueOf(str2)));
      
    }
}
