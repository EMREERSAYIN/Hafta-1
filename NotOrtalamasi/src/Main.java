import java.util.Scanner;


public class KDV {
  public static void main(String[] args) {
    //KDV Hesaplama - KDV Calculation

    Scanner input= new Scanner(System.in);
    double total=0, kdv=0;
    System.out.println("Enter the fee amount:");
    total=input.nextDouble();
    kdv=total;
    if (total<=1000 && total>0)
    {
      kdv += (total*0.18);
      System.out.println("Price: "+total+" KDV %18: "+kdv);
    }
    else{
      kdv += (total*0.8);
      System.out.println("Price: "+total+" KDV %8: "+kdv);
    }
  }
}