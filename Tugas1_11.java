import java.util.Scanner;

public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahAngka = 0;

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int angka = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
                jumlahAngka++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak : " + jumlahAngka);
    }
}
