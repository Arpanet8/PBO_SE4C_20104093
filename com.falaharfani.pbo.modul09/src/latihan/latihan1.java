package latihan;

import java.io.FileNotFoundException;

public class latihan1 {
    public static void method1()
        throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada!");
    }

    public static void main(String[] args) {
        try {
            method1();
        }

        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
