import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x,toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Girin: ");
        x= input.nextInt();

        for(int i =1; i <=x; i++){
            if(i%4==0){
                System.out.println(i);
                toplam=toplam+i;
            }
            else if(x%2==1){
                System.out.println("Tek Sayı Girişi yaptınız!");
                break;
            }
        }
        System.out.println("4'ün katları olan sayıların toplamı : "+ toplam);
    }
}