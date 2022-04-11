package Java101;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
import java.util.Scanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {
        int k, total=0, count=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz: ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                count++;
                total += i;
            }
        }double average = (total / count);
        System.out.println("Girilen Sayıların Ortalaması: "+average);
    }
}
