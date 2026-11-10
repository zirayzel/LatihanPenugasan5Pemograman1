import java.util.Scanner;

// SOAL 4 — Angka 1-7 menjadi Nama Hari (switch)
public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        String namaHari;
        switch (angka) {
            case 1:  namaHari = "Senin";   break;
            case 2:  namaHari = "Selasa";  break;
            case 3:  namaHari = "Rabu";    break;
            case 4:  namaHari = "Kamis";   break;
            case 5:  namaHari = "Jumat";   break;
            case 6:  namaHari = "Sabtu";   break;
            case 7:  namaHari = "Minggu";  break;
            default: namaHari = "Angka tidak valid! Masukkan 1-7.";
        }

        System.out.println("Hari ke-" + angka + " adalah: " + namaHari);
        sc.close();
    }
}

