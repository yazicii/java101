package Java101;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import java.util.Scanner;

public class GirilenSayilarin4ve5inKuvvetleri {
    public static void main(String[] args) {
        /*int k;
        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz:  ");
        k = input.nextInt();


        for (int i=1; i<=k; i*=2){
            System.out.println(i);
        }

    }*/
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Değerini Giriniz:");
        n = input.nextInt();

        for (int i = 1; i <= n; i*=4){
            System.out.println("4'ün katı: "+i);
        }for (int l = 1; l<=n; l*=5){
            System.out.println("5'in katı: "+l);
        }


    }
}
