import java.util.Scanner;

// SOAL 2 — Positif, Negatif, atau Nol
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = sc.nextDouble();

        if (angka > 0) {
            System.out.println(angka + " adalah bilangan POSITIF");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan NEGATIF");
        } else {
            System.out.println("Angka adalah NOL");
        }
        sc.close();
    }
}
