class Pen
{
    String color;
    String type;

    public void wrtie()
    {
        System.out.println("Write");
    }

    public void printcolor()
    {
        System.out.println(this.color);
    }
}

class Student
{
    String name;
    int age;

    void printInfo()
    {
         System.out.println(this.name);
         System.out.println(this.age);        
    }
    Student(String name,int age)
         {
            this.name=name;
            this.age=age;
            System.out.println("Constructor called:");
         }
}
public class oops {
    public static void main(String[] args) {
      Student s1= new Student("Samagra",19);
     

      s1.printInfo();
}    
}
