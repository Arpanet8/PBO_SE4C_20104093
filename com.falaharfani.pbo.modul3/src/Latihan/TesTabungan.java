package Latihan;

public class TesTabungan {
    public static void main(String args[]) {

        boolean status;

        Tabungan tabungan=new Tabungan(10000);
        System.out.println("Saldo awal : "+tabungan.keSaldo());

        tabungan.nyimpenDuit(8000);
        System.out.println("Jumlah uang yang disimpan : 8000");

        status=tabungan.njukutlDuit(7000);
        System.out.print("Jumlah uang yang diambil : 7000");
        {
            if (status)
            System.out.println(" ok");
        else {
            System.out.println(" gagal");
        }
            tabungan.nyimpenDuit(1000);

            System.out.println("Jumlah uang yang disimpan : 1000");
            status=tabungan.njukutlDuit(10000);

            System.out.print("Jumlah uang yang diambil : 10000");
            {
                if (status)
                System.out.println(" ok");
            else
                System.out.println(" gagal");
            }
            status=tabungan.njukutlDuit(2500);

            System.out.print("Jumlah uang yang diambil : 2500");
            {
                if (status)
                System.out.println(" ok");
            else
                System.out.println(" gagal");
            }

            tabungan.nyimpenDuit(2000);
            System.out.println("Jumlah uang yang disimpan : 2000");
            System.out.println("Saldo sekarang = " + tabungan.keSaldo());
        }
    }
}
