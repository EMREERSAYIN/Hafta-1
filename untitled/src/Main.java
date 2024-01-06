import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçim Yapınız: ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("TOPLAM :" + (n1 + n2));
        } else if (select == 2) {
            System.out.println("FARK : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("ÇARPIM: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0){
                System.out.println("BÖLÜM: " + (n1 / n2));
            } else {
                System.out.println("Sayı 0'a bölünmez!");
            }
        } else {
            System.out.println("Yanlış Seçim Yaptınız!. Tekrar Deneyiniz!");
        }



            }
        }


