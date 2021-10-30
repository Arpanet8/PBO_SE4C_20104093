package percobaan;

public class Bank2 {
    public static void main(String[] args) {
        Tabungan2 saya = new Tabungan2("barca", 12345);
        Tabungan2 kamu = new Tabungan2("manu", 1246, 15000, 22222);

        saya.setSaldo(10000);
        saya.setPin(11111);

        System.out.println("Saldo awal saya : "+saya.getSaldo());
        System.out.println("Saldo awal kamu : "+kamu.getSaldo());
        System.out.println("Nomor pin saya  : "+ saya.getPin());
        System.out.println("Nomor pin kamu  : "+kamu.getPin());
    }
}
