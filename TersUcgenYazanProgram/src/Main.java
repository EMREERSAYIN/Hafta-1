import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Bir Sayı Girin: ");
        int n= input.nextInt();

        for(int i = 0; i< n; i++){
            for(int j = 0 ;j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 2*n-1 ; k >= (2*i+1) ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}