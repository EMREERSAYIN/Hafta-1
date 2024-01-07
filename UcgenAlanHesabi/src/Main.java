import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        double alan;

        Scanner input = new Scanner (System.in);
        System.out.println("A kenar değeri : ");
        a = input.nextInt();

        System.out.println("B kenar değeri : ");
        b = input.nextInt();

        System.out.println("C kenar değeri : ");
        c = input.nextInt();

        d = (a+b+c)/2;
        alan = Math.sqrt( d * (d - a) * (d - b ) * (d - c));

        System.out.println("Üçgenin Alanı : " + alan);








    }
}