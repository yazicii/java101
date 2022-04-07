package Java101;

import java.util.Scanner;

//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

public class HavaDurumunaGöre {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the air temperature :  ");
        heat = input.nextInt();
        if (heat<5){
            System.out.println("Go skiing. ");
        }
        else if (heat>5 && heat<15){
            System.out.println("Go to cinema. ");
        }
        else if (heat>10 && heat<25){
            System.out.println("Go to picnic. ");
        }
        if (heat>=25){
            System.out.println("Go to swim.  ");
        }



    }
}
