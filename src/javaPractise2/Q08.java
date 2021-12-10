package javaPractise2;
import java.util.Scanner;
public class Q08 {
	 public static void main(String[] args) {
	/*
    Problem tanımı:
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method yazınız
     Test DAta :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */
   Scanner scan = new Scanner(System.in);
    
    System.out.println("Bir cümle yaziniz :");
    String a = scan.nextLine();
    
    a= a.trim();
    int count=0;
    
    a=a.replaceAll("\\s+", " ");// tum birden fazla bosluklari sildik.
  
    int length=a.length();
    
			for (int i = 0; i < length; i++) { // kac tane bosluk oldugunu yani kelime sayisini buldum.
				if (a.charAt(i)==' ') {
					count++;
				}
			}System.out.println(count);
		
		for (int i=0; i <count+1; i++) { // kelime sayisinca dongude kelimeleri kestim ve tersten yazdirdim.
			int b=a.lastIndexOf(" ");
			String a1=a.substring(b+1);
			System.out.print(a1+" ");
			a=a.substring(0, b+1).trim();
			
		}
		
	 }

}