import java.util.Scanner;

public class jobsheet2 {
  public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    System.out.print("Nilai UAS \t\t: ");
    Float UAS = input15.nextFloat();
    System.out.print("Nilai UTS \t\t: ");
    float UTS = input15.nextFloat();
    System.out.print("Nilai Kuis \t\t: ");
    float Kuis = input15.nextFloat();
    System.out.print("Nilai Tugas \t\t: ");
    float Tugas = input15.nextFloat();

    float total = (UAS * 0.4f) + (UTS * 0.3f) + (Kuis * 0.1f) + (Tugas * 0.2f);
    System.out.println("Nilai Akhir \t\t: " + total);

    if (total >= 81) {
      System.out.println("Anda mendapat Nilai huruf A");
    } else if (total >= 74) {
      System.out.println("Anda mendapat Nilai huruf B+");
    } else if (total >= 66) {
      System.out.println("Anda mendapat Nilai huruf B");
    } else if (total >= 61) {
      System.out.println("Anda mendapat Nilai huruf C+");
    } else if (total >= 51) {
      System.out.println("Anda mendapat Nilai huruf C");
    } else if (total >= 38) {
      System.out.println("Anda mendapat nilai huruf D");
    } else if (total >= 0) {
      System.out.println("Anda mendapat Nilai huruf E");
    }
    input15.close();
  }
}
