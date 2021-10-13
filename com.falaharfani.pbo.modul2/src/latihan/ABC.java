package latihan;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int a,b,c;
            System.out.print("Masukan Nilai A : ");
            a = scan.nextInt();
            System.out.print("Masukan Nilai B : ");
            b = scan.nextInt();
            System.out.print("Masukan Nilai C : ");
            c = scan.nextInt();
        System.out.println("Hasil Dari A+B-C Adalah : "+(a+b-c));
    }
}
