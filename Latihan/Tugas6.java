import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama  : ");
        double a = sc.nextDouble();
        System.out.print("Masukkan sisi kedua    : ");
        double b = sc.nextDouble();
        System.out.print("Masukkan sisi ketiga   : ");
        double c = sc.nextDouble();

        System.out.printf("Sisi: %.1f, %.1f, %.1f%n", a, b, c);

        boolean validSegitiga = (a + b > c) && (a + c > b) && (b + c > a);
        boolean positif = (a > 0) && (b > 0) && (c > 0);

        if (!positif || !validSegitiga) {
            System.out.println("Jenis: BUKAN SEGITIGA");
        } else if (a == b && b == c) {
            System.out.println("Jenis: SEGITIGA SAMA SISI (ketiga sisi sama)");
        } else if (a == b || b == c || a == c) {
            System.out.println("Jenis: SEGITIGA SAMA KAKI (dua sisi sama)");
        } else {
            System.out.println("Jenis: SEGITIGA SEMBARANG (semua sisi berbeda)");
        }
        sc.close();
    }
}

