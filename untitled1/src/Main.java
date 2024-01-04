import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10; //a'nın değeri -->10
        int b = 2; //b'nin değeri --> 2
        int c = 3; //c'nin değeri --> 3

        int hesap = a+b*c-b;         /* çarpma ve bölme önceliklidir toplama ve çıkarmaya göre.
        Burada ilk b ve c arasında çarpma işlemi olacak --> 6
          */

        System.out.println("hesap : " );
        System.out.println(a+(b*c)-b);
    }
}
