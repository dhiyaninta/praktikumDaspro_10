
import java.util.Scanner;
/*
n = (2 +(10 mod 3)) = 3 */
public class Triangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i =  1; 
        while (i <= n) {
            while (i <= n) {
                int j = 0;
                while (j < i) {
                    System.out.print("*");
                    j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
       }
    }
    
}