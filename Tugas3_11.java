import java.util.Scanner;

public class Tugas3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko : ");
            jumlahToko = input.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSemuaBarang = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("Toko " + toko);

            int jumlahPelanggan;
            do {
                System.out.print(" Jumlah pelanggan : ");
                jumlahPelanggan = input.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println(" Tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + p + " : ");
                    barang = input.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);

                totalBarangToko += barang;
            }

            totalSemuaBarang += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);
        }

        System.out.println();
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        input.close();
    }
}