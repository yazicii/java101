package Java101;
//Dairenin Alanını ve Çevresini Hesaplayan Program
//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//Alan Formülü : π * r * r;
//Çevre Formülü : 2 * π * r;
import java.util.Scanner;

public class DaireAlanıHesaplama {
    private static String[] args;

    public static void main(String[] args) {
        int r;
        Scanner input = new Scanner(System.in);
        double alan, cevre;

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();

        alan = (Math.PI * r * r);
        cevre = (2 * Math.PI * r);

        System.out.println("Dairenin Alanı :  "+alan);
        System.out.println("Dairenin Çevresi :  "+cevre);
 //Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360

        int yarıÇap;
        double a, daireDilimAlanı, pi;
        pi = 3.14;

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        yarıÇap = input.nextInt();
        System.out.print("Merkez Açısının Ölçüsü :  ");
        a = input.nextDouble();
        daireDilimAlanı = (pi*(yarıÇap*yarıÇap)*a)/360;
        System.out.println("Daire Diliminin Alanı :  "+daireDilimAlanı);



    }

















}
