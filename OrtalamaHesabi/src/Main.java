import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi, sayac=0;
        double ortalama=0, toplam=0;

        System.out.println("Sayı giriniz: ");
        sayi = input.nextInt();

        for(int i =1; i <=sayi; i++){
            if(i%4==0 || i%3==0){
                System.out.println(i);
                toplam = toplam+i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println(ortalama);
    }
}
