package Java101;

import java.util.Scanner;

//Vücut Kitle İndeksi Hesaplama
//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
//Formül
//Kilo (kg) / Boy(m) * Boy(m)
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, kitleIndeksi;
        Scanner input = new Scanner(System.in);


        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        kitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kitleIndeksi);


    }
}
