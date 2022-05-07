package Java101;
//Ödev
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
import java.util.Scanner;

public class ArmstagSayi {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sayı Giriniz:");
        int tempNumber = input.nextInt();

        int number = tempNumber;
        int numberCounter=0;
        int numberValue;
        int numberPow=1;
        int result = 0;

        while (tempNumber != 0){
            numberCounter++;
            tempNumber/=10;
        }

        tempNumber = number;
        while (tempNumber != 0){
            numberValue = tempNumber % 10;

            numberPow = 1;
            for (int i = 1; i<=numberCounter;i++){
                numberPow *= numberValue;

            }
            result += numberPow;
            tempNumber/=10;
        }

        if (result == number){
            System.out.println(number+" sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println(number+" sayısı bir Armstrong sayısı değildir.");
        }*/


        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        int numberValue;
        int result = 0;

        while (number != 0){
            numberValue = number % 10;
            result += numberValue;
            number /= 10;
        }
        System.out.println("Basamak Sayılarının toplamı: "+result);


    }
}
