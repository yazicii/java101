package Java101;
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        /*int n, total=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 1){
                total += n;
            }
        }while (n>0);

        System.out.println("Toplam: "+total);
        */
        int i, total=0;
        boolean flag=true;

        Scanner input = new Scanner(System.in);

        while (flag){
            System.out.print("Sayı Giriniz: ");
            i= input.nextInt();
            if (i % 2 == 1){
                flag = false;
            }else if (i % 4 == 0 && 0<i){
                total += i;
            }
        }
        System.out.println("Toplam: "+total);


    }
}
