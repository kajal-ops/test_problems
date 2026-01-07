public class poly {
    public static void main(String[] args) {
        Student s = new Student();
        s.printInfo("Kajal");       // only name
        s.printInfo(12);            // only age
        s.printInfo("Kajal", 21);   // name + age
    }
}

class Student {
    String name;
    int age;

    // Overloaded Method 1
    void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded Method 2
    void printInfo(int age) {
        System.out.println("Age: " + age);
    }

    // Overloaded Method 3
    void printInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
