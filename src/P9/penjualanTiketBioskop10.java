package P9;
import java.util.Scanner;
/*
P=10
harga tiket = 40000 + (10 mod 6) * 2000 = 48000
syarat diskon pertama = lebih dari (3 + ( 10 mod 3 ) = 4 tiket
diskon (8 + (10 mod 5))% = 8 % 
syarat diskon ke 2 = lebih dari (8+(10 mod 4)) = 10 tiket,  dengan diskon (15 + (10 mod 4))% = 17 %*/
public class penjualanTiketBioskop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga = 48000, jmlTiket = 0, i = 0, totaltiket = 0;
        double diskon = 0, totalHarga = 0, totaHarga1hari = 0;

        System.out.print("Masukkan jumlah tiket: ");
        jmlTiket = sc.nextInt();
       
        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Tidak valid. Masukkan ulang!");
                continue;
            }
            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket > 4 && jmlTiket <= 10) {
                diskon = 0.08;
            } else if(jmlTiket > 10){
                diskon = 0.17;
            }
            diskon = (jmlTiket*harga) * diskon;
            totalHarga = jmlTiket*harga - diskon;
            System.out.println("Total harga: " + totalHarga);

            totaltiket += jmlTiket;
            totaHarga1hari += totalHarga; 
            i++;
        }
        System.out.println("Total tiket dalam 1 hari: " + totaltiket);
        System.out.println("Total harga dalam 1 hari: Rp" + totaHarga1hari);
    }
}