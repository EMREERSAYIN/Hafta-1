import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, toplamTutar, sonUcret;
        int acilis = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç km Gideceksiniz? : ");
        km = input.nextInt();
        toplamTutar = acilis + (km * 2.20);
        sonUcret = toplamTutar < 20 ? 20 : toplamTutar;

        System.out.println("Toplam Ödenecek Tutar: " + sonUcret);
    }
}