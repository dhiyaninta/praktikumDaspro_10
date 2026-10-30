package P9;
import java.util.Scanner;
/*
P = 10
tarif parkir mobil = 2500 + (10 mod 6) * 250 = 3500
tarif parkir motor = 1500 + (10 mod 6) * 250 = 2500  */
public class parkirKendaraan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
        System.out.print("Masukkan jenis kendaraan anda (1(mobil), 2(motor), 0(keluar)): ");
        jenis = input.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi anda parkir: ");
                durasi = input.nextInt();
                if (jenis == 1) {
                    total += durasi* 3500;
                } else{
                    total += durasi * 2500;
                }
            }  else if (jenis != 0) {
                System.out.println("Tidak valid");
            } 
        } while (jenis != 0);
        System.out.println("Total bayar anda adalah: Rp " + jenis);
    }
}