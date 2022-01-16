package percobaan;

public class Bank {
    public static void main(String[] args) {

        Tabungan saya = new Tabungan("Barca", 50410420,1_000_000, 12345);

        System.out.println("Nama        : "+saya.getNama());
        System.out.println("No Rekening : "+saya.getNoRekening());
        System.out.println("Saldo       : " + saya.getSaldo());
        System.out.println("Pin         : "+saya.getPin());
    }
}
