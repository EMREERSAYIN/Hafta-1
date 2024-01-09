import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.println("Kaç Faktöriyel istyiyorsun ?: ");
        int sayi = input.nextInt();

        while( sayi > 0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("faktöriyel = " + faktoriyel);

    }
}