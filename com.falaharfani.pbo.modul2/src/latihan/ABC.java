package latihan;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int jmlh,hsl,a,b,c;

            System.out.print("Masukan Jumlah Kasus : ");
            jmlh = scan.nextInt();

            for (int s = 1; s <= jmlh; s++){
                System.out.print("Masukan Nilai A"+s+" : ");
                a = scan.nextInt();
                System.out.print("Masukan Nilai B"+s+" : ");
                b = scan.nextInt();
                System.out.print("Masukan Nilai C"+s+" : ");
                c = scan.nextInt();
                hsl = a+b-c;
                System.out.println("Hasil Dari A" +s+ "+B" +s+ "-C" +s+ " Adalah : " +hsl+ "\n");
            }
    }
}
