//WAP which contains a class with attributes such as (name:String,20, age:integer value greater than 5 , salary: float value greater than 1500000 ) in the end print a line data inserted successfully

import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;

    void getData() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        if(name.length() > 20)
            throw new Exception("Name must be within 20 characters");

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        if(age <= 5)
            throw new Exception("Age must be greater than 5");

        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
        if(salary <= 1500000)
            throw new Exception("Salary must be greater than 1500000");
    }
}

class Exception1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        boolean success = false;

        try {
            e.getData();
            success = true;
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if(success)
                System.out.println("Data inserted successfully");
        }
    }
}

