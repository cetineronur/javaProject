package Lambda01;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, -3, 65, 3, 3, 7, 34, 22, -60, 42, 15));
        ciftKareSiralaList(list);
        toplaEl1(list);
        toplaEl2(list);
        ciftCarpim(list);
        enKucuk(list);
        onBesBuyukenKucukTekSayi(list);
        ciftElemanKareKbSirala(list);
        tekElemanKarebKSirala(list);
    }

    //List'in cift olan elemanlarinin karelerini aliniz. ve en buyugunu uazdiriniz.

    public static void ciftKareSiralaList(List<Integer> list) {
        Optional<Integer> maxEl = list.stream().filter(t -> t % 2 == 0).map(t -> t * t).reduce(Integer::max);
        //Optional<Integer> maxEl=  list.stream().filter(t->t%2==0).map(t->t*t).reduce(Math::max);
        System.out.println(maxEl);
    }
    // listteki tum elemanlarin toplamini yazdiriniz

    public static void toplaEl1(List<Integer> list) {
        System.out.println();
        System.out.println(list.stream().reduce((t, u) -> t + u));
      //  System.out.println(toplam);
    }

    public static void toplaEl2(List<Integer> list) {
        System.out.println();
        Optional<Integer> toplam = list.stream().reduce(Integer::sum);
        System.out.println(toplam);
    }

    public static void ciftCarpim(List<Integer> list) {
        System.out.println();
        Optional<Integer> carpim = list.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact);
        System.out.println(carpim);
    }

    public static int minBul(int x,int y){
        return x<y ?x:y;
    }
    // List teki elemanlardan en kucugunu 4 farkli yontem ile yazdiriniz.
    public static void enKucuk(List<Integer> list) {
        System.out.println();
        Optional<Integer> min = list.stream().reduce(Math::min);
        Optional<Integer> min1 = list.stream().reduce(Integer::min);
        Optional<Integer> min2 = list.stream().reduce(Lambda03::minBul);
        Integer min3 = list.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
        System.out.println(min);
        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
    }
    //List'teki 15'ten buyuk en kucvuk tek sayiyi yazdiriniz

    public static void onBesBuyukenKucukTekSayi(List<Integer> list){

        System.out.println(list.stream().filter(t -> t > 15 & t % 2 == 1).reduce(Integer::min));
    }


    public static void yazdirma(int k){
        System.out.print(k+" ");
    }

    //Listin cift elemanlarinin karelerini  kucuten buyuge yazdiriniz.

    public static void ciftElemanKareKbSirala (List<Integer> list){

        list.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().forEach(Lambda03::yazdirma);
    }

    //Listin tek elemanlarinin karelerini  buyukten kucuge yazdiriniz.

    public static void tekElemanKarebKSirala (List<Integer> list){
        System.out.println();
        list.stream().filter(t -> t % 2 == 1).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Lambda03::yazdirma);
    }

}
