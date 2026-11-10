import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double a = sc.nextDouble();

        System.out.print("Masukkan operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua  : ");
        double b = sc.nextDouble();

        double hasil;
        switch (op) {
            case '+':
                hasil = a + b;
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.printf("%.2f * %.2f = %.2f%n", a, b, hasil);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Tidak bisa membagi dengan nol!");
                } else {
                    hasil = a / b;
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, hasil);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Tidak bisa modulo dengan nol!");
                } else {
                    hasil = a % b;
                    System.out.printf("%.2f %% %.2f = %.2f%n", a, b, hasil);
                }
                break;
            default:
                System.out.println("Operator tidak dikenali! Gunakan: + - * / %");
        }
        sc.close();
    }
}

