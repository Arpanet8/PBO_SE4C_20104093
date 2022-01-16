package percobaan;

public class percobaan4 {
    public static void main(String[] args) {
        int[] e = new int[2];

        try {
            System.out.println("Access element in there : "+ e[3]);
        }

        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception thrown : " + e);
        }

        finally {
            e[0] = 6;
            System.out.println("First element value : "+e[0]);
            System.out.println("Finally statment is executed!");
        }
    }
}
