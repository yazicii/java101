package Java101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner input =new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam : "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(n1-n2));
                break;
            case 3:
                System.out.println("çarpma : "+(n1*n2));
                break;
            case 4:
                if (n2==0){
                    System.out.println("Bir sayı 0'a bölünemez ! ");
                }else {
                    System.out.println("Bölme : "+(n1/n2));
                }
                break;
            default:
                System.out.println("Yanlış seçim yapyınız. Tekrar deneyiniz. ");


        }
    }
}
