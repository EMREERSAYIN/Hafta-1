import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // taban sayısı : a
        // kuvvet sayısı : b
        int a, b;
        int sonuc = 1;

        System.out.println( "taban sayısını girin :");
        a = input.nextInt();
        System.out.println( "kuvvet sayısını girin :");
        b = input.nextInt();

        for(int i = 1; i <= b; i++){
            sonuc *= a;
        }
        System.out.println("cevap :" + sonuc);

    }
}