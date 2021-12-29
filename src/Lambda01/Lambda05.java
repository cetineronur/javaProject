package Lambda01;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda05 {
    public static void main(String[] args) {
        TechPro trGunduz=new TechPro("yaz","TR gunduz",97,124);
        TechPro engGunduz=new TechPro("kis","ENG gunduz",95,131);
        TechPro trGece=new TechPro("bahar","TR gece",98,143);
        TechPro engGece=new TechPro("sonbahar","ENG gece",93,151);

        List<TechPro> list = new ArrayList<>(Arrays.asList(trGunduz,engGunduz,trGece,engGece));

        System.out.println(batchOrt92Byk(list));
        System.out.println(ogrSayilari110Az(list));
        System.out.println(herhangiBirBaharKontrol(list));
        System.out.println(ogrenciSayilarinaBuyukKucugeSirala(list));
        System.out.println(batchOrtBuyukKucukSirala(list));
        System.out.println(ogrenciSayisiEnazIkinciBatch(list));
        System.out.println(ortalama95BuyukOgrenciSayilariToplami(list));
        System.out.println(ortalama95BuyukOgrenciSayilariToplami1(list));
        System.out.println(ogrenciSayisi130BuyukBatchOrtalamasi(list));
        System.out.println(gunduzBAtchSayisi(list));
        System.out.println(ogrenciSayisi130EnBuyukBatchOrt(list));
        System.out.println(ogrenciSayisi150DennkucukBatchOrt(list));
    }

    //batch ortalamalarinin 92den buyuk oldugunu kontrol bir program creat et
    public static boolean batchOrt92Byk(List<TechPro> list){
      return  list.
                stream().
                allMatch(t->t.getBatchOrt()>92);// akisdaki her eleman batchort fieldina gore eslesmesi kontrol edildi.

    }

    //ogrnc sayilarinin hic birinin 110 den az olmadigi kontrol eden
    public static boolean ogrSayilari110Az(List<TechPro> list){

        System.out.println();
        return  list.
                stream().
                allMatch(t->t.getOgrcSayisi()>=110);// akisdaki her eleman batchort fieldina gore eslesmesi kontrol edildi.

    }
    //batchlerde herhangi birinde "bahar" olup olmadigini kontrol
    public static boolean herhangiBirBaharKontrol(List<TechPro> list){

        System.out.println();
        return  list.
                stream().anyMatch(t->t.getBatch().equals("bahar"));
    }

    //batchleri ogr sayilarina gore b->kucuge siralayiniz
    public static List<TechPro> ogrenciSayilarinaBuyukKucugeSirala(List<TechPro> list){
        System.out.println();
      return  list.stream().sorted(Comparator.comparing(TechPro::getOgrcSayisi).reversed()).
               collect(Collectors.toList());// collect e toplanan elemanlari liste cevirir.
    }

    //batchleri batch ort gore b-->k siralayip ilk3"unu yazdiriniz
    public static List<TechPro> batchOrtBuyukKucukSirala(List<TechPro> list){
        System.out.println();
     return list.stream().
             sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).
             limit(3).//akisdaki ilk uc elemani aldi
             collect(Collectors.toList());//akisdaki ilk uc elemanlari istenen sarta gore liste yazdirsi
    }

    //batchleri ogrnci sayisi en az olan 2.batch i yazdiriniz
    public static List<TechPro> ogrenciSayisiEnazIkinciBatch(List<TechPro> list){
        System.out.println();
        return list.stream().
                sorted(Comparator.comparing(TechPro::getOgrcSayisi)).//ogrenci parametresine gore siralama
                limit(2).//ilk iki eleman alindi
                skip(1).//ilk eleman atlandi
                collect(Collectors.toList());//akisdaki ilk uc elemanlari istenen sarta gore liste yazdirsi
    }

    //batch ortalamalari 95'den buyuk olan batchlerin ogrenci sayilari toplami
    public static int ortalama95BuyukOgrenciSayilariToplami(List<TechPro> list){

        System.out.println();
     return  list.stream().
               filter(t->t.getBatchOrt()>95).//95 den buyuk elemanlar filtrelendi
               map(t->t.getOgrcSayisi()).
               reduce(0,(t,u)->t+u);//ogrenci sayisi toplandi
    }

    //batch ortalamalari 95'den buyuk olan batchlerin ogrenci sayilari toplami
    public static int ortalama95BuyukOgrenciSayilariToplami1(List<TechPro> list){

        System.out.println();
        return  list.stream().
                filter(t->t.getBatchOrt()>95).//95 den buyuk elemanlar filtrelendi
                        mapToInt(t->t.getOgrcSayisi()).// mapToInt()---> typeina gore int return eder ki sum() calisir.
                sum();
    }

    //ogrenci sayisi 130 dan buyu olan batchlerin batch ortalamasi
    public static OptionalDouble ogrenciSayisi130BuyukBatchOrtalamasi(List<TechPro> list){
        System.out.println();
        return list.stream().
                filter(t->t.getOgrcSayisi()>130).
                mapToDouble(t->t.getBatchOrt()).
                average();
    }

    //gunduz batch sayisi
    public static int gunduzBAtchSayisi(List<TechPro> list){
        System.out.println();
       return (int) list.stream().filter(t->t.getBatchName().contains("gunduz")).count();
    }

    //ogrenci sayilari 130"dan fazla batchlerin en buyuk batch ortunu bulunuz.
    public static OptionalInt ogrenciSayisi130EnBuyukBatchOrt(List<TechPro> list){

        System.out.println();
        return list.stream().filter(t->t.getOgrcSayisi()>130).mapToInt(TechPro::getBatchOrt).max();
    }

    //ogrenci sailari 150 den az olan batch lerin en kucuk batch ortunu bul
    public static int ogrenciSayisi150DennkucukBatchOrt(List<TechPro> list){
        System.out.println();
        return list.stream().filter(t->t.getOgrcSayisi()<150).mapToInt(TechPro::getBatchOrt).min().
                getAsInt(); // ciktiyi int type olarak return eder.
    }
}
