package P9;
import java.util.Scanner;
/*
P = 10
tarif parkir mobil = 2500 + (10 mod 6) * 250 = 3500
tarif parkir motor = 1500 + (10 mod 6) * 250 = 2500  */
public class parkirKendaraan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kendaraan, jam, totalbayar = 0;

        do {
        System.out.print("Masukkan jenis kendaraan anda (1(mobil), 2(motor), 0(keluar)): ");
        kendaraan = input.nextInt();
            if (kendaraan == 1 || kendaraan == 2) {
                System.out.print("Masukkan durasi anda parkir: ");
                jam = input.nextInt();
                if (kendaraan == 1) {
                    totalbayar += jam * 3500;
                } else{
                    totalbayar += jam * 2500;
                }
            }  else if (kendaraan != 0) {
                System.out.println("Tidak valid");
            } 
        } while (kendaraan != 0);
        System.out.println("Total bayar anda adalah: Rp " + totalbayar);
    }
}