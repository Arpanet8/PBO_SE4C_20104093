package percobaan;

public class Aritmatika {
    public static void main(String[] args) {
        System.out.print("Operasi aritmatika " + "pada tipe integer");

        int a = 2 + 1; // penjumlahan
        int b = a - 1; // pengurangan
        int c = a * b; // perkalian
        int d = c / 3; // pembagian
        int e = - a;  // negasi
        System.out.println();

        //output
        System.out.println("Nilai a " + a);
        System.out.println("Nilai b " + b);
        System.out.println("Nilai c " + c);
        System.out.println("Nilai d " + d);
        System.out.println("Nilai e " + e);
        System.out.println();

        System.out.println("Operasi aritmatika " + "pada tipe floating-point");
        double fa = 2 + 1;
        double fb = fa - 1;
        double fc = fa * fb;
        double fd = fc / 3;
        double fe = -fa;

        System.out.println("Nilai fa : " + fa);
        System.out.println("Nilai fb : " + fb);
        System.out.println("Nilai fc : " + fc);
        System.out.println("Nilai fd : " + fd);
        System.out.println("Nilai fe : " + fe);

    }
}