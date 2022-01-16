package percobaan;

public class Classroom {
    private int classcode;
    private String classname;
    private Student student;

    public Classroom(int classcode, String classname){
        this.classcode = classcode;
        this.classname = classname;
    }
    public void setStudent(Student student){
        this.student = student;
    }

    public int getClasscode() {
        return classcode;
    }

    public String getClassname() {
        return classname;
    }

    public String getStudentName() {
        return student.getNama();
    }
}
