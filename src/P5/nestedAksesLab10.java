package jobsheet5;
import java.util.Scanner;

public class nestedAksesLab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = input.nextBoolean();
        System.out.print("Apakah mahasiswa sedang disanksi? (9true/false): ");;
        sedangDisanksi = input.nextBoolean();
        System.out.print("Apakah mahasiswa punya izin dosen? (true/false): ");
        punyaIzinDosen = input.nextBoolean();
        System.out.print("APakah seorang asisten lab? (true/false): ");
        asistenLab = input.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println(" Akses ditolak: Membutuhkan izin dosen atu status asisten lab");
            }
        } else{
            System.out.println("Akses ditolak: Status mahasiswa tidak memenuhi syarat");
        }

    }
    
}
