import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = sc.nextInt();

        String grade;
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        String status = (nilai >= 55) ? "LULUS" : "TIDAK LULUS";

        System.out.println("Nilai  : " + nilai);
        System.out.println("Grade  : " + grade);
        System.out.println("Status : " + status);
        sc.close();
    }
}

