
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, islem, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("1) Topla\n2) Çıkar\n3) Çarp\n4) Böl\n" +
                "Yapmak istediğiniz işlemi seçiniz : ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                sonuc = a+b;
                System.out.println("sonuç = " + sonuc);
                break;

            case 2:
                sonuc = a-b;
                System.out.println("sonuc = " + sonuc);
                break;

            case 3:
                sonuc = a*b;
                System.out.println("sonuç = " + sonuc);
                break;

            case 4:
                switch (b) {
                    case 0:
                        System.out.println("0'dan farklı sayı girin!");
                        break;
                    default:
                        sonuc = a/b;
                        System.out.println("sonuç = " + sonuc);
                }
                break;

            default:
                System.out.println("lütfen 1-4 arası sayılarından birini seçiniz");
        }
    }
}