package Java101;
import java.util.Scanner;
//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
// yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
// İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
// Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
public class UcakBiletFiyatiProgrami {
    public static void main(String[] args) {
            int km, age, triptype;
            double ücret;
            Scanner input = new Scanner(System.in);
            System.out.print("Mesafeyi Kilometre Cinsinden giriniz:");
            km = input.nextInt();
            System.out.print("Yaşını giriniz:");
            age = input.nextInt();
            System.out.print("Yolculuk tipini giriniz(1=>Tek 2=>Gidiş Dönüş):");
            triptype = input.nextInt();
            ücret = km * 0.10;
            if (km < 0 || age < 0 || (triptype != 1 && triptype != 2)) {
                System.out.println("Hatalı Giriş");
            } else if (age < 12) {
                ücret = (ücret - ((ücret * 50) / 100));
                if (triptype == 2) {
                    ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else if (triptype == 1) {
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else System.out.println("Hatalı Veri Girdiniz");
            } else if (age >= 12 && age <= 24) {
                ücret = (ücret - ((ücret * 10) / 100));
                if (triptype == 2) {
                    ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else if (triptype == 1) {
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else System.out.println("Hatalı Veri Girdiniz");
            } else if (age >= 65) {
                ücret = (ücret - ((ücret * 30) / 100));
                if (triptype == 2) {
                    ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else if (triptype == 1) {
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else System.out.println("Hatalı Veri Girdiniz");
            } else {
                ücret = km * 0.10;
                if (triptype == 2) {
                    ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                } else if (triptype == 1) {
                    System.out.println("Toplam Tutar:" + ücret + "TL");
                }
            }

        }
    }