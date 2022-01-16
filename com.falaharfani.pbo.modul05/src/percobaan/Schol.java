package percobaan;

public class Schol {
    public static void main(String[] args) {
        Classroom clasA = new Classroom(101, "Class 101");
        Classroom clasB = new Classroom(102, "Class 201");
        Classroom clasC = new Classroom(103, "Class 103");

        Student stdA = new Student();
        Student stdB = new Student("pyra");
        Student stdC = new Student(101010,"mythra");

        clasA.setStudent(stdA);
        clasB.setStudent(stdB);
        clasC.setStudent(stdC);

        System.out.println(clasA.getClassname());
        System.out.println("Class Code : "+clasA.getClasscode());
        System.out.println("Student : "+ clasA.getStudentName());
        System.out.println();

        System.out.println(clasB.getClassname());
        System.out.println("Class Code : "+clasB.getClasscode());
        System.out.println("Student : "+ clasB.getStudentName());
        System.out.println();

        System.out.println(clasC.getClassname());
        System.out.println("Class Code : "+clasC.getClasscode());
        System.out.println("Student : "+ clasC.getStudentName());
        System.out.println();
    }
}
