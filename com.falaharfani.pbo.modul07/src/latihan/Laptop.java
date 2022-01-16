package latihan;

public class Laptop {
    // contoh overiding
    public String merk = "ASUS";
    public int ram=12;

    public void laptopAsus(){
        System.out.println("Merek Laptop : "+merk);
        System.out.println("Ram Laptop : "+ram);
    }
    public void laptopLenovo(String merek, int ram){
        System.out.println("Merek Laptop : "  + merek);
        System.out.println("Ram Laptop : "+ram);
    }
}
