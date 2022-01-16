package percobaan;

public class Zoo {
    public static void main(String[] args) {
        Animal Lion = new Animal("leon");
        Animal unknow = new Animal();
        Bird eangle = new Bird("Eangle", 5);
        Cat cat = new Cat("miyu", 3, "orange");


        System.out.println("Lion name : "+Lion.name);
        System.out.println("Lion age : "+Lion.age);
        Lion.walk();
        System.out.println();

        System.out.println("unnknow name : "+unknow.name);
        System.out.println("unnknow age : "+unknow.age);
        unknow.walk();
        System.out.println();

        System.out.println("Bird name : "+eangle.name);
        System.out.println("Bird age : "+eangle.age);
        eangle.walk();
        eangle.fly();
        System.out.println();

        System.out.println("Cat name : "+cat.name);
        System.out.println("Cat age : "+cat.age);
        cat.walk();
        System.out.println();
    }
}