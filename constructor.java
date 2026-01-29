class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student(590014891, "Samagra");
        s1.display();
    }
}
