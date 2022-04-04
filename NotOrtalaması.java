package Java101;
//Not Ortalaması Hesaplayan Program
//KURAL1: Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
//kural2:Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz ; ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuzuz Giriniz : ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = (toplam / 6.0);
        System.out.println("Ortalamanız:" + ortalama);
        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);


    }
}
