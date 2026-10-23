package jobsheet5;
import  java.util.Scanner;

public class seleksiColonAsistenPraktikum10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean statusMahasiswa, sanksiAkd, sertifikat;
        int nilaiMinDaspro, nilaiWawancara;
        /*
        Nilai min daspro = 75 + (10 mod 11) = 75 + 10 = 85
        Syarat nilai minimal wawancara = 70 + (10 mod 11) = 80 */

        System.out.print("Apakah anda memiliki status sebagai mahasiswa aktif? (true/false): ");
        statusMahasiswa = input.nextBoolean();
        input.nextLine();
        System.out.print("Apakah anda memiliki sanksi akademik? (true/false):  ");
        sanksiAkd = input.nextBoolean();
        input.nextLine();
        System.out.print("Apakah anda memiliki sertifikat? (true/false): ");
        sertifikat = input.nextBoolean();
        input.nextLine();
        System.out.print("Masukkan nilai dasar pemrograman anda: ");
        nilaiMinDaspro = input.nextInt();
        System.out.print("Masukkan nilai wawancara anda: ");
        nilaiWawancara = input.nextInt();

        if (statusMahasiswa == true && !sanksiAkd) {
            if (nilaiMinDaspro >= 85 || sertifikat == true) {
                System.out.println("Anda memenuhi persyaratan");
                if (nilaiWawancara >= 80) {
                    System.out.println("Selamat anda diterima sebagai asisten!!");
                } else{
                    System.out.println("Mohon maaf anda dinyatakan belum lolos sebagai asisten");
                }
            } else {
                System.out.println("Maaf anda masih belum memenuhi persyaratan");
            }

        } else {
            System.out.println("Anda tidak memenuhi semua persyaratan dasar");
        }
    }
    
}
