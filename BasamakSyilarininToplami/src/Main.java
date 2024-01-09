import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        int basamakdegeri = 0;
        int toplam = 0;

        while( a != 0) {
            basamakdegeri = a % 10;
            toplam = toplam + basamakdegeri;
            a /= 10;
        }
        System.out.println("Basamak Değerleri Toplamı: " + toplam);

    }

}