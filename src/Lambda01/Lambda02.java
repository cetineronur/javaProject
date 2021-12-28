package Lambda01;

import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

       int count=0;
       while(count<4) {
           Scanner scan = new Scanner(System.in);
           System.out.println("list icin integer degerler girin: ");
           int a = scan.nextInt();
           list.add(a);
           count++;
       }
        enBuyuk(list);
        enKucuk(list);
         sirala(list);
        ciftBul(list);
        tekBul(list);
    }
    public static void print(int x){
        System.out.print(x+" ");
    }

    public static void enBuyuk(List<Integer> list){
    Optional<Integer> max=list.stream().reduce(Math::max);
        System.out.println(max);
    }

    public static void enKucuk(List<Integer> list){
        Optional<Integer> min = list.stream().reduce(Math::min);
        System.out.println(min);
    }

    public static void sirala(List<Integer> list){
        list.stream().sorted().forEach(Lambda02::print);
    }

    public static void ciftBul(List<Integer> list){
        System.out.println();
        list.stream().filter(t->t%2==0).forEach(Lambda02::print);
    }

    public static void tekBul(List<Integer> list){
        System.out.println();
        list.stream().filter(t->t%2==1).forEach(Lambda02::print);
    }

    public static void topla(List<Integer> list){
        System.out.println();

    }
}
