import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= k; i++) {
            sonuc = sonuc * n;
        }
        System.out.println(n + " üssü " + k + " = " + sonuc);
    }
}
