package Lambda01;

import java.util.*;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        // funktional programming ile list elemanlñarinn cift olanlarinin karelerini ayni satirda yaziniz.
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55, 44));
        printCiftKarePrint(list);
        printTekKupPrint(list);
        printCiftKareKokPrint(list);
        MaxElPrint(list);
    }
    public static boolean ciftBul(int i) { // refere edilecek tohum
        return i%2==0;
    }

    public static void printEl(int t) {// refere edilecek method creat edildi
        System.out.print(t + " ");
    }

    public static void printCiftKarePrint(List<Integer> list){
        System.out.println();
        list.stream().filter(Lambda01::ciftBul).map(t->t*t).forEach(Lambda01::printEl);
    }

    public static void printTekKupPrint(List<Integer> list){ // tek olanlarin kuplerini bir fazlasini creata et
        System.out.println();
        list.stream().filter(t->t%2==1).map(t->(t*t*t)+1).forEach(Lambda01::printEl);
    }

    public static void printCiftKareKokPrint(List<Integer> list){ // cift olanlarin karekoklerini creata et
        System.out.println();
        list.stream().filter(t->t%2==0).map(Math::sqrt).forEach(t->System.out.println(t+" "));
    }

    public static void MaxElPrint(List<Integer> list){ // en buyuk elemanini creata et
        System.out.println();
        Optional<Integer> maxEl = list.stream().reduce(Math::max);
        System.out.println(maxEl);
        // reduce()--> azaltmak ... bir cok datayi tek bir dataya cevirmek
        }
}
