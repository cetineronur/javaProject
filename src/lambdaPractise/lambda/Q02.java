package lambdaPractise.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q02 {

//        2) Bir class oluşturun, 'Q03' olarak adlandırın
//        3) 5 elemanlı bir tamsayı listesi oluşturun
//        4) Elemanlari doğal sıraya koyun
//        5)Konsoldaki son 3 elemanın karelerinin toplamını bulun.
//        6) Konsoldaki toplamı yazdırın
//        7) 'Fonksiyonel Programlama' kullanın

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,7,1,4,3));
        method(list);
    }

    private static void method(List<Integer> list) {

    int a=list.stream().sorted().skip(2).mapToInt(t->t*t).sum();
        System.out.println(a);

    }
}
