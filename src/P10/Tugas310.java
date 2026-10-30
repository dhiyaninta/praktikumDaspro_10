package P10;
import java.util.Scanner;

public class Tugas310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlToko = 0;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jmlToko = input.nextInt();
        } while (jmlToko < 1);
        int totalBarang = 0;
        int maxBarang = -1;
        int tokoTerbaik = -1;

        for (int i = 1; i <= jmlToko; i++){
            int jmlPelanggan = -1;
            do{
                System.out.print("Masukkan jumlah pelanggan " + i + ": ");
                jmlPelanggan = input.nextInt();
                if (jmlPelanggan < 0) {
                    System.out.println("Tidak valid, input ulang!");
                }
            } while (jmlPelanggan < 0);

                int totalBarangToko = 0;
                for (int j = 1; j <= jmlPelanggan; j++) {
                    int jmlBarang = -1;
                    do {
                        System.out.print("Barang yang dibeli pelanggan ke- " + j + ": " );
                        jmlBarang = input.nextInt();
                        if (jmlBarang < 0){
                            System.out.println("Jumla barang tak boleh negatif!");
                        }
                    } while (jmlBarang < 0);
                    totalBarangToko += jmlBarang;
                }
                System.out.print("Toko " + i + " - pelanggan: " + jmlPelanggan + ", Total barang: " + totalBarang);
                totalBarang += totalBarangToko;

                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbaik = i;
                }
                System.out.println("Total barang seluruh toko: " + totalBarangToko);
                if (jmlToko > 0 && maxBarang >= 0) {
                    System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
                }
                input.close();
            }
        }
    }
    

