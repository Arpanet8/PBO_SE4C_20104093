package latihan;

public class StudentRecord {
    private String nama, address;
    private int age;
    private double mathGrade, englisGrade, scienceGrade, average;
    private static int studentCount;

    public String getNama() {
        return nama;
    }

    public void setNama(String temp) {
        nama = temp;
    }

    public double getAverage() {
        double result = 0;
        result = ( mathGrade+englisGrade+scienceGrade )/3;
        return result;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
