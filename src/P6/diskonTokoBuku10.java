package jobsheet5;
import java.util.Scanner;
public class diskonTokoBuku10 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in)   ;
       String jenisBuku = "", hari = "";
       int jumlahBuku;
       double diskon;
       boolean isRabu;


       /* buku kamus = (8+(10 mod 5))% = 8%, berlaku jika jumlah kamus yang di beli lebih dari (2+(10 mod 2)) = 2 buah
       buku novel = (2+(10 mod 4))% =4%, tambah 2% jika lebih dari (3+(10 mod 2)) = 3, tambah 1% jika novel < dari 3 atau ==
       diskon buku selain kamus/novel = (3 + (10 mod 4))% = 5%, berlaku jika jumlah buku (3+(10 mod 2)) = 3.
        */
       System.out.print("Apakah hari ini hari Rabu (true/false)?: ");
       isRabu = input.nextBoolean();
       input.nextLine();
       System.out.print("Masukkan jenis buku: ");
       jenisBuku = input.nextLine();


       System.out.print("Masukkan jumlah buku yang anda beli: ");
       jumlahBuku = input.nextInt();


       if (isRabu) {
           if (jenisBuku.equalsIgnoreCase("Kamus")) {
                   diskon = 0.08;
               if (jumlahBuku > 2) {
                   diskon += 0.02;
               }
           } else if (jenisBuku.equalsIgnoreCase("Novel")) {
               diskon = 0.04;
               if (jumlahBuku > 3) {
                   diskon += 0.02;
               } else {
                   diskon += 0.01;
               }
           } else {
               if (jumlahBuku > 3) {
                   diskon = 0.05;
               } else {
                   diskon = 0.00;
               }
           }
           System.out.println("Selamat anda mendapatkan diskon: " + diskon * 100 + "%");
       } else {
           System.out.println("Maaf anda tidak mendapatkan diskon");
       }
   }
}
