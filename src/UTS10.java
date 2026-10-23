
//P=10
//10 mod 3 = 1
//T1 = 6
//T2 = 15

import java.util.Scanner;

public class UTS10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kode, hrga_dasar, harga_tiket, banyaktiket;
        double potongan_harga, total_bayar, diskon = 0;
        boolean member;
        String jenisTiket;
        System.out.print("tiket ");
        System.out.print("1. reguler ");
        System.out.print("2. Terusan");
        System.out.print(". pelajar ");
        System.out.print("Masukkan kode: ");
        kode = input.nextInt();
        System.out.print("Masukkan jenis tiket: ");
        jenisTiket = input.nextLine();
        System.out.println("Apakah anda member(True/false): ");
        member =input.nextBoolean();
        input.nextLine();
        System.out.println("Banyak tiket: ");
        banyaktiket = input.nextInt();


        switch (kode) {
            case 1:
                if(banyaktiket <= 6 && member == true){
                    diskon = 0.1;
                    potongan_harga = 35000 * diskon;
                    harga_tiket = 35000 + (1 * 5000) * banyaktiket;
                    total_bayar = harga_tiket- potongan_harga;

                }else if(banyaktiket >= 6 && banyaktiket <= 15 && member == true ){
                    diskon = 0.2;
                    potongan_harga = 35000 * diskon;
                    harga_tiket = 35000 + (1 * 5000) * banyaktiket;
                    total_bayar = harga_tiket- potongan_harga;
                } else {
                    if (banyaktiket >=6 && member==false) {
                        harga_tiket = 35000 + (1 * 5000) * banyaktiket;
                        total_bayar = harga_tiket;
                    }else if (banyaktiket >= 6 && banyaktiket <= 15 && member == false) {
                        harga_tiket = 35000 + (1 * 5000) * banyaktiket;
                        total_bayar = harga_tiket; 
                    }
                }
                break;
            case 2:
                if(banyaktiket <= 6 && member == true){
                    diskon = 0.1;
                    potongan_harga = 60000 * diskon;
                    harga_tiket = 60000 + (1 * 5000) * banyaktiket;
                    total_bayar = harga_tiket- potongan_harga;

                }else if(banyaktiket >= 6 && banyaktiket <= 15 && member == true ){
                    diskon = 0.2;
                    potongan_harga = 60000 * diskon;
                    harga_tiket = 60000 + (1 * 5000) * banyaktiket;
                    total_bayar = harga_tiket- potongan_harga;
                }else {
                    if (banyaktiket >=6 && member==false) {
                        harga_tiket = 60000 + (1 * 5000) * banyaktiket;
                        total_bayar = harga_tiket;
                    }else if (banyaktiket >= 6 && banyaktiket <= 15 && member == false) {
                        harga_tiket = 60000 + (1 * 5000) * banyaktiket;
                        total_bayar = harga_tiket;   
                    }
                }
                break;
            case 3:
                if(banyaktiket <= 6 && member == true){
                    diskon = 0.1;
                    potongan_harga = 25000 * diskon;
                    harga_tiket = 25000 + (1 * 5000) * banyaktiket;
                    total_bayar = harga_tiket- potongan_harga;

                }else if(banyaktiket >= 6 && banyaktiket <= 15 && member == true ){
                    diskon = 0.2;
                    potongan_harga = 25000 * diskon;
                    harga_tiket = 25000 + (1 * 5000) * banyaktiket;
                    total_bayar = harga_tiket- potongan_harga;
                } else {
                    if (banyaktiket >=6 && member==false) {
                        harga_tiket = 25000 + (1 * 5000) * banyaktiket;
                        total_bayar = harga_tiket;
                    }else if (banyaktiket >= 6 && banyaktiket <= 15 && member == false) {
                        harga_tiket = 25000 + (1 * 5000) * banyaktiket;
                        total_bayar = harga_tiket;   
                    }
                }
                break;
            default:
                System.out.println("Tidak valid");
                break;
            } System.out.println("total bayar" + total_bayar);
        
        }
    } 


