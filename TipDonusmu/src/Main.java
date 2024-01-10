import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalıklı Sayı Giriniz :");
        double doubleInput = scanner.nextDouble();

        System.out.print("Tam Sayı Girin: ");
        int integerInput = scanner.nextInt();

        // ondalıklı sayıyı tam sayıya dönüştür
        int convertedDouble = (int) doubleInput;
        System.out.println("Ondalıklı Sayı, Tam Sayıya dönüştüğünde :" + convertedDouble );

        //tam sayıyı ondalıklı sayıya dönüştür
        double convertedInteger = (double) integerInput;
        System.out.println("Tam Sayı, Ondalıklı Sayıya Dömüştüğünde : " + convertedInteger );
    }
}