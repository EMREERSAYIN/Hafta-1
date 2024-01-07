import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fiyat, kdv, kdvlifiyat, kdvtutarı;
        System.out.println("Ürünün fiyatını girin: ");
        fiyat= input.nextInt();

        if(fiyat<=1000 && fiyat>0)
        {
            kdv = 0.18;
            kdvtutarı = fiyat* kdv;
            kdvlifiyat = fiyat+ kdvtutarı;
            System.out.println("ürünün kdv'siz fiyatı : " + fiyat);
            System.out.println("uygulanan kdv oranı : " + kdv);
            System.out.println("kdv tutarı : " + kdvtutarı);
            System.out.println("ürünün kdvli fiyatı : " + kdvlifiyat);
        }
        else if(fiyat>1000)
        {
            kdv = 0.08;
            kdvtutarı= fiyat * kdv;
            kdvlifiyat= fiyat + kdvtutarı;
            System.out.println("ürünün kdv'siz fiyatı : " + fiyat);
            System.out.println("uygulanan kdv oranı : " + kdv);
            System.out.println("kdv tutarı : " + kdvtutarı);
            System.out.println("ürünün kdvli fiyatı : " + kdvlifiyat);
        }
    }
}
