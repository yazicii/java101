package Java101;
//Ödev
//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni
// girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
// "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
import java.util.Scanner;

public class PatikaKullaniciGirisi {
    public static void main(String[] args) {
        String userName, paswoord, newPasword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz :  ");
        paswoord = input.nextLine();

        if (userName.equals("patika") && paswoord.equals("java123")){
            System.out.println("Giriş Yapıldı ");

        }else if (userName.equals("patika") && !paswoord.equals("java123")){
            System.out.println("Şifreniz Hatalı !!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?\n1-Evet\n2-Hayır");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.print("Yeni şifreniz : " +input.nextLine());
                    newPasword = input.nextLine();
                    if (newPasword.equals("java123")){
                        System.out.println("Yeni şifreniz oluşturulamadı. ");
                    }else {
                        System.out.println("Şifreniz oluşturuldu. ");
                    }
                    break;
                case 2:
                    System.out.println("iyi günler dileriz");
                    break;
            }
        }



    }
}
