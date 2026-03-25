import java.util.*;

class Student {
    String name;
    int rollNo;
    int[] marks = new int[5];

    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double calculatePercentage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / 5.0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + calculatePercentage());
        System.out.println();
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            int[] marks = new int[5];
            System.out.println("Enter marks of 5 subjects:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }

            list.add(new Student(name, roll, marks));
        }

        System.out.println("\nStudent Details:");
        for (Student s : list) {
            s.display();
        }
    }
}