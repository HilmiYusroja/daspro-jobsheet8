import java.util.Scanner;

public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int nilai = i * j;
                System.out.print(nilai + "\t");

                jumlah += nilai;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka : " + jumlah);
    }
}
