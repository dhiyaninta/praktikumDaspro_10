package P10;
import java.util.Scanner;

public class Tugas110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        int totalAngka = 0;

        int i =  1; 
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                totalAngka++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total angka: " + totalAngka);
        input.close();
        } 
    }

    
