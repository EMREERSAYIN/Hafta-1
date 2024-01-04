import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        double boy = scan.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        double kilo = scan.nextDouble();

        double index = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: " + index);

               }




    }
