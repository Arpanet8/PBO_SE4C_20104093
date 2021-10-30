package latihan;

public class StudentREcordExample {
    public static void main(String[] args) {

        StudentRecord wahyu = new StudentRecord();
        StudentRecord ini = new StudentRecord();
        StudentRecord nama = new StudentRecord();

        wahyu.setNama("wahyu");
        ini.setNama("ini");
        nama.setNama("nama");

        System.out.println(wahyu.getNama());
        System.out.println("Hitung = "+StudentRecord.getStudentCount());
    }
}
