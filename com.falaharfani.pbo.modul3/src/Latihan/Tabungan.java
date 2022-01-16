package Latihan;

public class Tabungan {
    public int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;

    }
    public int keSaldo(){
        return this.saldo;

    }
    public void nyimpenDuit(int jmlh){
        saldo += jmlh;

    }
    public boolean njukutlDuit(int jmlh){
        if (jmlh <= keSaldo()){
            saldo -= jmlh;
            return true;
        }else {
            return false;
        }
    }
}
