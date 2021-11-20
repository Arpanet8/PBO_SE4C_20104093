package latihan;

public class TokoLaptop extends Laptop{

    public static void main(String[] args) {
        Laptop laptopAsus = new Laptop();
        Laptop laptopLenovo = new Laptop();

        System.out.println("Laptop Pertama");
        laptopAsus.laptopAsus();
        System.out.println("Laptop Kedua");
        laptopLenovo.laptopLenovo("Lenovo", 8);
    }
}
