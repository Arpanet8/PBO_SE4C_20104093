package Percobaan;

public class KomplekPerumahan {
    public static void main(String[] args) {

        // construct object 'r' dari class 'rumah'
        Rumah r = new Rumah();

        // memanggil method setAlamat yang memiliki objek r
         r.setAlamat("Alamat Saya Di Jalan Pramuka");

         // melihat hasil run dari alamat_Rumah yang berobjek r
         System.out.println(r.alamat_Rumah);
    }
}
