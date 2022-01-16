package percobaan;

public class Tabungan2 {
    private String nama;
    private int noRekening, saldo, pin;

    public Tabungan2(String nama, int noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    public Tabungan2(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public boolean tarikUang(int jumlahtarik){
        if (jumlahtarik <= getSaldo()){
            saldo -= jumlahtarik;
            return true;
        }else {
            return false;
        }
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int jumlah) {
        this.saldo = jumlah;
    }
    public int getPin() {
        return this.pin;
    }
    public void setPin(int pinBaru) {
        this.pin = pinBaru;
    }
}
