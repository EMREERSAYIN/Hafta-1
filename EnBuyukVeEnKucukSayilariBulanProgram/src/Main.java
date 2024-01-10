import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max=0, min=0, n, number;
        System.out.println("Kaç tane sayı girecek siniz? : ");
        number = input.nextInt();
        for(int i=1; i<=number; i++){
            System.out.println(i+". sayı: ");
            n=input.nextInt();
            if(i==1){
                min=n;
                max=n;
            }
            else if(n>=max){
                max=n;
            }
            else if(n<=min){
                min=n;
            }
        }
        System.out.println("min: "+min+" max: "+max);
    }
}
