package percobaan;

public class Student {
    private int nrp;
    private String nama;

    public Student(){
        this(0,"Null");
    }
    public Student(String nama){
       this(0, "Null");
    }
    public Student(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }


    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
