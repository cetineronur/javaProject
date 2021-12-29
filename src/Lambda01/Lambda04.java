package Lambda01;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda04 {
     public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("cincix","abuziddin","mehmet","emre","nilgun","yıldız","kader","emine","islam","islam","emre"));
         List<Integer> liste = new ArrayList<>(Arrays.asList(5,8,-5,69,79,80));

         bykHarfTekrarsizSira(list);
        listElemanlariniKrakterSayisiniTersSiraliTekrarsiz(list);
        krakterSayisiKbSirala(list);
        sonHarfTersSirali(list);
        ele(list);
         krakrerSayisiniYedidenAzOlma(list);
         wIleBaslamaKontrol(list);
         xIleBitenKontrol1(list);
         krakterSayisiEnBuyuk(list);
         krakterSayisiEnBuyuk(list);
         krakterSayisiEnBuyuk2(list);
         sonHarfIlkElemanHaricSirala(liste,list);

        }
        public static void yazdirma(String k){
        System.out.print(k+" ");
        }
    
        //List elemanlarini alfabetik buyuk harf ve tekrarsiz yazdiriniz.
        public static void bykHarfTekrarsizSira(List<String> list){
            list.
                stream().//akisa girdi.
                map(t->t.toUpperCase()).
                sorted().// alfabetik sira
                distinct().//tekrarsiz yapildi
                forEach(Lambda04::yazdirma);
        }
    
        //List elemanlari krakter sayisini ters sirali olarak tekrarsiz yazdirin
        public static void listElemanlariniKrakterSayisiniTersSiraliTekrarsiz(List<String> list){

        System.out.println();
        list.stream().
                map(t->t.length()). // String data krakter sayisina update edildi.
                sorted(Comparator.reverseOrder()). // ters sira
                distinct().// tekrarsiz
                forEach(Lambda03::yazdirma);
        }

        //list elemanlarini krakter sayisina gore kucukten buyuge gore yazdiriniz.
        public static void krakterSayisiKbSirala(List<String> list){
        System.out.println();
        list.stream().sorted().distinct().//tekrarsiz sirali
                sorted(Comparator.comparing(t->t.length())).//eleman krakter sayisina gore ozel siralama yapin.
                forEach(Lambda04::yazdirma);
        }

        //list elemnalarini son harfine gore ter sirali
        public static void sonHarfTersSirali(List<String> list){
         System.out.println();
         list.stream().sorted(Comparator.comparing(t->t.toString().
                        charAt(t.toString().length()-1)). // elemannin son indexinin krakterini siralar.
                reversed()).distinct().//ters sira tekrarsiz
                forEach(Lambda04::yazdirma);
    }

        //uzunlugu cift sayi olan elemanlarin uzunluklarinin karelerini hesaplayan,
        // tekrarsiz buyukten kucuge sirali yazdiriniz.
        public static void ele(List<String> list){
            System.out.println();
             list.stream().
                map(t->t.length()*t.length()).// String elemanlar krakter sayisinin karesi alindi
                filter(t->t%2==0).// cift elemanlilar bulundu.
                distinct().// tekrarsiz
                sorted(Comparator.reverseOrder()).// ters sira
                forEach(Lambda03::yazdirma);// integer yazdirma metodu calistirildi.
    }
        // List elemanlrinin karakter sayisini 7 ve 7 den az olma durumunu kontrol ediniz.
        public static void krakrerSayisiniYedidenAzOlma(List<String> list){

         System.out.println(list.stream().allMatch(t->t.length()<=7)// her bir elemani harf sayisi<=7 eslemesine bakti
                    ?"List elemanlari yedi harften kucuk":"list elemanlari yedi harften buyuk");

        }

        //List elemanlrinin w ile baslamasini kontrol ediniz
        public static void wIleBaslamaKontrol(List<String> list){

            System.out.println();
            System.out.println( list.stream().
                    noneMatch(t->t.startsWith("w"))// hicbir sarti saglamazsa true en az bir eleman sarti saglasa false.
                    ?"w ile baslayan isim yok":"w ile baslayan isim var");
        }

        //List elemanlrinin x ile biten en az bir elemani kontrol ediniz.
        public static void xIleBitenKontrol1(List<String> list){

            System.out.println();
            System.out.println( list.stream().anyMatch(t->t.endsWith("x"))?"x ile biten isim var":"x ile biten isim yok");
        }

        //krakter sayisi en buyuk elemani yazdirin

        public static void krakterSayisiEnBuyuk(List<String> list){
            System.out.println();
            System.out.println(list.stream().
                    sorted(Comparator.comparing(t -> t.toString().length()).// length karakter uzunluguna gore siraladi.
                            reversed()).findFirst());//ters sira yazdirip ilki karakter sayisi en buyuk oldu
            System.out.println(list.stream().
                    sorted(Comparator.comparing(t -> t.toString().length()).// length karakter uzunluguna gore siraladi.
                            reversed()).
                    limit(1));// limit(a) akisdan cikan elemanlardan ilk a elemani alir.

     }

        public static void krakterSayisiEnBuyuk2(List<String> list){
            System.out.println();
            Stream<String> sonisim = list.stream().
                    sorted(Comparator.comparing(t -> t.toString().length()).// length karakter uzunluguna gore siraladi.
                            reversed());//ters sira yazdirip ilki karakter sayisi en buyuk oldu
            System.out.println(list.stream().
                    sorted(Comparator.comparing(t -> t.toString().length()).// length karakter uzunluguna gore siraladi.
                            reversed()).limit(1));// limit(a) akisdan cikan elemanlardan ilk a elemani alir.
            System.out.println(Arrays.toString(sonisim.toArray()));//arraye cevirip yazdirdik.
        }

        //list elemanlarini son harfine gore siralayip ilk eleman haric kalan elemanlari yazdiriniz.

    public static void sonHarfIlkElemanHaricSirala(List<Integer> liste, List<String> list){
        System.out.println(liste.stream().reduce(Integer::min));
         list.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.length()-1))).
                 skip(1).//akistan cikan elemanlarin 1. elemani atlar.
                 forEach(t->System.out.print(t+" "));
    }




}
