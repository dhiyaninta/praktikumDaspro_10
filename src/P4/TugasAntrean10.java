import java.util.Scanner;

public class TugasAntrean10 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int kode;
        String layanan, loket;

        System.out.println("==== MESIN ANTREAN DIGITAL ====");
        System.out.println("Layanan: ");
        System.out.println("1. Legalisir Ijazah ");
        System.out.println("2. Surat Keterangan Aktif Kuliah ");
        System.out.println("3. Pembayar UKT ");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.print("Masukkan Kode: ");
        kode = input.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Loket D");
                break;

            default:
                System.out.println("Tidak Ada layanan");
                break;
        }

    }
    
}

