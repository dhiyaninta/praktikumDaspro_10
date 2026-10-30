package P10;
import java.util.Scanner;
/*
P = 10
(2 + (10 mod 3)) = 3
(4 + (10 mod 3)) = 5
(5 + ( 10 mod 3)) = 6
(2 + (10 mod 3)) = 3
4 + (10 mod 4) = 6
6 + (10 mod 4) = 8 */
public class Rectangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
