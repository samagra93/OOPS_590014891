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
public class OOPS {
    public static void main(String[] args) {
        //Pen pen1 = new Pen();
        //pen1.color="blue";
        //pen1.type="ball";

        //Pen pen2 = new Pen();
        //pen2.color="black";
        //pen2.type="gel";

        //pen1.printcolor();
        //pen2.printcolor();

      Student s1= new Student("Samagra",19);
     
      s1.printInfo();
}    
}
