package latihan;

public class PC {

    //contoh overloading
    public void komputer(){
        int ram=8;
        int ssd=256;
        System.out.println("jumlah RAM : "+ram);
        System.out.println("jumlah SSD : "+ssd);
    }
    public void komputer(int ram, int ssd){
        System.out.println("jumlah RAM : "+ram);
        System.out.println("jumlah RAM : "+ssd);
    }
    public static void main(String [] args){
        System.out.println("Toko PC");
        PC pc;
        pc = new PC();
        System.out.println("PC pertama");
        pc.komputer();
        System.out.println("PC kedua");
        pc.komputer(12, 512);
    }
}
