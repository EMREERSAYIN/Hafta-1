import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n1=0,n2=1,n3,n4,i,n;

        Scanner input = new Scanner(System.in);

        System.out.print("fibonacci serisi kaç tane olsun :");
        n = input.nextInt();

        System.out.print(n1 + "-" + n2);
        for(i = 2; i<n; ++i)
        {
            n3 = n1 + n2;
            System.out.print("-" + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}