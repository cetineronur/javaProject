package lambdaPractise.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));

        tumTekSayilar(list);
        altiIleOnDortArasiKare(list);
        tekSayilarKarekokToplam(list);


    }

    public static void print(int k){
        System.out.print(k+" ");
    }

    //Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    private static void tumTekSayilar(List<Integer> list) {
        list.stream().filter(t->t%2==1).forEach(Q06::print);
    }

    //6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    private static void altiIleOnDortArasiKare(List<Integer> list) {
        System.out.println();
        list.stream().filter(t->t>6&t<14).map(t->t*t).forEach(Q06::print);

    }
    //Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    private static void tekSayilarKarekokToplam(List<Integer> list) {
        System.out.println();
        double a =list.stream().filter(t->t%2==1).mapToDouble(Math::sqrt).sum();
        System.out.println(a);
    }
}
