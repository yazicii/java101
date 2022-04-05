package Java101;
//Ödev
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//Formül
//Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//𝑢 = (a+b+c) / 2
//
//Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)


import java.util.Scanner;

public class üçgeninAlanınıBulma {
    public static void main(String[] args) {

        double aKenarı, bKenarı, cKenarı, u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("a kenar uzunluğunu yazınız :  ");
        aKenarı = input.nextDouble();
        System.out.print("b kenar uzunuluğunu yazınız :  ");
        bKenarı = input.nextDouble();
        System.out.print("c kenar uzunluğunu yazınız :  ");
        cKenarı = input.nextDouble();

        u = ((aKenarı+bKenarı+cKenarı)/2);
        alan = Math.sqrt(u*(u-aKenarı)*(u-bKenarı)*(u-bKenarı)*(u-cKenarı));
        System.out.println("Üçgenin Alanı =  "+alan);



    }
}
