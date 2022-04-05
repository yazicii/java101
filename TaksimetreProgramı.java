package Java101;
//Taksimetre Programı
//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

import java.util.Scanner;

public class TaksimetreProgramı {
    public static void main(String[] args) {
        double yol, kmTutarı, tutarHesaplama, taksimetreAçılış;

        Scanner input = new Scanner(System.in);

        kmTutarı = 2.20;
        System.out.print("Gidilecek yol uzunluğunu KM cinsinden giriniz :  ");
        taksimetreAçılış = 10;
        yol = input.nextDouble();

        tutarHesaplama = taksimetreAçılış+(yol*kmTutarı);

        tutarHesaplama = (tutarHesaplama<20)?20:tutarHesaplama;
        System.out.println("Gidilecek yolun tutarı :  "+tutarHesaplama);





    }
}
