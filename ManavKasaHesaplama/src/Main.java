
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican = 7.00;

        System.out.print("Salatalık Kaç Kg : ");
        double salatalikKilo = scan.nextDouble();

        System.out.print("Elma Kaç Kg : ");
        double elmaKilo = scan.nextDouble();

        System.out.print("Kabak Kaç Kg : ");
        double kabakKilo = scan.nextDouble();

        System.out.print("Domates Kaç Kg : ");
        double domatesKilo = scan.nextDouble();

        System.out.print("Patlıcan Kaç Kg : ");
        double patlicanKilo = scan.nextDouble();


        double toplam = 0.0;
        toplam += (salatalik * salatalikKilo);
        toplam += (elma * elmaKilo);
        toplam += (kabak * kabakKilo);
        toplam += (patlican * patlicanKilo);
        toplam += (domates * domatesKilo);

        System.out.println("Toplam Tutar : " + toplam + "TL");

    }

}