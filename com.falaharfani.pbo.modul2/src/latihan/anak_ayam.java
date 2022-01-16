package latihan;

import java.util.Scanner;

public class anak_ayam {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int ank_aym, s;

        System.out.print("Masukan Jumalah Anak Ayam : ");
        ank_aym = scann.nextInt();
        for (s = ank_aym; s > 1; s--){
            System.out.print("Anak Ayam Turun " + ank_aym+ "\n");
            ank_aym=s-1;
            System.out.println("Mati 1 Tinggal " + ank_aym);
        }
        System.out.println("Anak Ayam Turun 1 \nMati 1 Tinggal Induknya");
    }
}
