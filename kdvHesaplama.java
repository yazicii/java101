package Java101;
//Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//(Not : KDV tutarını 18% olarak alın)
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double ürünTutarı, kdvOranı, kdvTutar, kdvli;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz : ");
        ürünTutarı = input.nextDouble();
        kdvOranı = 0.18;
        kdvTutar = ürünTutarı * kdvOranı;
        kdvli = ürünTutarı + kdvTutar;

        boolean kdvTutarı = ürünTutarı>1000;
        kdvOranı = kdvTutarı ? 0.08:0.18;


        System.out.println("Ürünün KDV'siz Tutarı : "+ürünTutarı);
        System.out.println("KDV Oranı : "+kdvOranı);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("Ürünün KDV'li Tutarı :  "+kdvli );












    }




}
