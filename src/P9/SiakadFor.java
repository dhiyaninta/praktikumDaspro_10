package P9;
/*
P = 10
Jumlah mahasiswa =8 +(10 mod 5) 
= 8
. P pertanyaan no 4. 55 + (10 mod 11) = 55 + 10 
= 65*/

import java.util.Scanner;
public class SiakadFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 100, terendah = 0;
        int lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            input.nextLine();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } 
            if (nilai >= 65) {
              lulus = lulus + 1;
            } else{
                tidakLulus = tidakLulus + 1;   
            }
        }
        System.out.println("Nilai tertingggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah anak lulus: " + lulus);
        System.out.println("Jumlah anak tidak lulus: " + tidakLulus);
    }
    
}