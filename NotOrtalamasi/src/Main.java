import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int mat, fizik, kimya, türkçe, tarih, müzik;


      Scanner inp = new Scanner(System.in);

      System.out.print("Matematik Notunuz : ");
      mat = inp.nextInt();

      System.out.print("Fizik Notunuz : ") ;
      fizik = inp.nextInt();

      System.out.print("Kimya Notunuz : ");
      kimya = inp.nextInt();

      System.out.print("Türkçe Notunuz : ");
      türkçe = inp.nextInt();

      System.out.print("Tarih Notunuz : ");
      tarih = inp.nextInt();

      System.out.print("Müzik Notunuz : ");
      müzik = inp.nextInt();

      int toplam = (mat + fizik + kimya + türkçe + tarih + müzik);
      double ortalama = toplam / 6.0;
      System.out.println("Not Ortalaması = " + ortalama );

      boolean kosul1 = ortalama >= 60;

      String gecti = (kosul1) ? "Sınıfı Geçtin :) " : "Sınıfta Kaldın :(";
      System.out.println(gecti);

    }
}