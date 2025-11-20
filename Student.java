class Student1 {
    String name;
    int age;
    String id;


    Student1(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Abdullah", 20, "ST123");
        s1.displayInfo();
    }
}
