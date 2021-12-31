package lambdaPractise.proje;

public class Ogrenci {
    //bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    // toString methodu ile ogrenci bilgilerin yazdirin
    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    //Öğrencileri yaşlarına göre sıralayark yazdırin
    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    //Öğrencileri isimlerine göre yazdırın
    //Öğrencileri soyisimlerine göre yazdır,n
    //Öğrencileri cinsiyetlerine göre yazdıran
    //listeyi yazdırırken içinde veri var mı diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlı Öğrenci nesneleri oluşturun.


    private String name;
    private String soyAd;
    private int yas;
    private double diplomaNotu;
    private String cinsiyet;

    public String getSoyAd() {
        return soyAd;
    }

    public String getName() {
        return name;
    }

    public int getYas() {
        return yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public Ogrenci(String name, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.name = name;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", diplomaNotu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}
