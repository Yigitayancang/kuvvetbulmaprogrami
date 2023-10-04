import java.util.Scanner;

public class pratik {

    public static void main(String[] args) {
        
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("SAYI GİRİNİZ : ");
        a = inp.nextInt();
        for(int i=1; i<=a; i*=2){
            System.out.println(i);
        }
        
    }
    
}