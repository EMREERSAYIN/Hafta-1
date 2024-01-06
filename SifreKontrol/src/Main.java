import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adı: ");
        userName = inp.nextLine();

        System.out.println("Şifre: ");
        password = inp.nextLine();

        if(userName.equals ("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız.");
        } else {
            System.out.println("Kullanıcı Adı veya parola Yanlış!!!");

            }
        }
    }
