import java.util.Scanner;

public class jobsheet {
  public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    System.out.print("Masukkan Angka : ");
    int angka = input15.nextInt();

    String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
    System.out.println("Bilangan " + angka + " adalah Bilangan " + hasil);
    input15.close();
  }
}
