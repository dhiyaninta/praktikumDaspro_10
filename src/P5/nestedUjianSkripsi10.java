package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
P1 = 8 + ( 10 % 5) = 8
P2 = 4 +(10 % 3) = 4 + 1 = 5
 */ 

        String pesan = "";

        System.out.print("Apakah mahasiswa sudah kompen? (Ya/Tidak): ");
        String bebasKompen = input.nextLine().trim();
        //: fungsi trim() digunakan untuk menghapus spasi sebelum dan setelah String 
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = input.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = input.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 5){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 5) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 5 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali";
            } else if (bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P2 kurang dari 5 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        } 
        System.out.println((String)pesan);
    }
}

