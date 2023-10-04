import java.util.Scanner;
public class KuvvetProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; i <= sayi; i++) {
            int kuvvet4 = (int) Math.pow(4, i);
            if (kuvvet4 <= sayi) {
                System.out.println("4^" + i + " = " + kuvvet4);
            }
        }
        System.out.println("5'in kuvvetleri:");
        for (int i = 0; i <= sayi; i++) {
            int kuvvet5 = (int) Math.pow(5, i);
            if (kuvvet5 <= sayi) {
                System.out.println("5^" + i + " = " + kuvvet5);
            }
        }
    }
}
