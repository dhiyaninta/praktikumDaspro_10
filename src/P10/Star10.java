import java.util.Scanner;
/*
P = 10
3 + (10 mod 5) = 3
9 + (10 mod 5) = 9 
4 + (10 mod 4) = 6
10 + (10 mod 6) = 14*/

public class Star10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
    
}
