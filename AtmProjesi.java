package Java101;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class AtmProjesi {
    /*public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        double balance = 1500;
        int select;

        while (right>0){
            System.out.print("Kullanıcı Adınızı Giriniz:");
            userName = scan.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = scan.nextLine();

            if (userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz bankasına hoşgeldiniz.");

                do {
                    System.out.println("1-Para Yatırma \n2-Para Çekme \n3-Bakiye Sorgulama \n4-Hızlı Para Çek (50tl)\n5-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    select = scan.nextInt();
                    if (select==1){
                        System.out.print("Yatırılacak tutar: ");
                        int price = scan.nextInt();
                        balance += price;
                    }else if (select==2){
                        System.out.print("Çekilecdek tutar: ");
                        int price = scan.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye yetersiz!");
                        }else {
                            balance -= price;
                        }
                    }else if (select==3){
                        System.out.println("Bakiyeniz: "+balance);
                    }else if (select==4){
                        balance -= 50;
                    }
                }while (select!=5);
                System.out.println("Tekrar görüşmek üzere");

                break;
            }else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Yanlış. Tekrar Deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz");
                }else {
                    System.out.println("kalan hakkınız: "+right);
                }

            }
        }


    }*/
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int select;
        double balance = 1500;

        while (right>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName=scan.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password=scan.nextLine();

            if (userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz bankasına hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Hızlı Para Çek\n5-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            int price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            int pric = scan.nextInt();
                            balance -= pric;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        case 4:
                            balance -=50;
                            break;
                    }

                }while (select!=5);
                System.out.println("Görüşürüz");
                break;
            }else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
