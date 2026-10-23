import java.util.Scanner;

public class Tugas1Pemilihan10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean uktLunas;
        String pesan;
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran UKT terverifikasi, Silahkan cetak KRS dan minta tanda tangan DPA" : "“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu" ;
        System.out.println(pesan);
    }
}