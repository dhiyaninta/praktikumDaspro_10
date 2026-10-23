import java.util.Scanner;
public class Tugas2Pemilihan10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jumlahSks;
        System.out.print("Masukkan Jumlah SKS Anda: ");
        jumlahSks = input.nextInt();
        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS Valid");
        }
    }
    
}
