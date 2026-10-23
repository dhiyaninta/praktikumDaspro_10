package jobsheet5;
import java.util.Scanner;
public class operatorLogikaWifi10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mahasiswa, dosen, akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");;
        mahasiswa = input.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen =  input.nextBoolean();
        System.out.print("Apakah akun diblokir? (true/false)");
        akunDiblokir = input.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("akses WiFi ditolak");
        }
    }
}
