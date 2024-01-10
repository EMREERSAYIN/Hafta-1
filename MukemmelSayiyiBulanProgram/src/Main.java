import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                total += i;
            }
        }
        if(n == total) {
            System.out.println(n + " Mükemmel Sayıdır.");
        }
        else {
            System.out.println(n+ " Mükemmel Sayı Degildir.");
        }
    }
}