package percobaan;

public class percobaan1 {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[5] = 100;
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks array melebihi batas!");
        }
    }
}
