package tag29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		
		int[] array ={1, 2, 3, 4, 5, 6};
		List<Integer> list = new ArrayList<>();
		
		Random r=new Random(); //random sınıfı
		   int a=r.nextInt(array.length);
		  // System.out.println(a);
		   
		   list.add(a);
		   for (Integer w : array) {
			System.out.println(w);
		}

	}

}
