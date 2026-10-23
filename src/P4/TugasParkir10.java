import java.util.Scanner;
public class TugasParkir10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tarif_Awal_2jam = 2000, jam_Berikutnya = 1000, total_harga, total_Jam;
        System.out.print("Masukkan lama parkir: ");
        total_Jam = input.nextInt();
        if (total_Jam > 2) {
            total_harga = tarif_Awal_2jam + ((total_Jam - 2) * jam_Berikutnya);
            System.out.println("Total bayar parkir anda: " + total_harga);
        } else{
            total_harga = tarif_Awal_2jam;
            System.out.println("Total bayar parkir anda: " + tarif_Awal_2jam);
        }




    }

    
}
