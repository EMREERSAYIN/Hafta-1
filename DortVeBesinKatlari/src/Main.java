import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("sınır sayısı girin: ");
        n = input.nextInt();
        for(int i =1; i <=n; i*=2){
            double a = Math.pow(4,i);
            System.out.println("4'ün "+i+". kuvveti: "+ a);
        }
        for(int i =1; i <=n; i*=2){
            double b= Math.pow(5,i);
            System.out.println("5'in "+i+". kuvveti: "+ b);
        }
    }
}