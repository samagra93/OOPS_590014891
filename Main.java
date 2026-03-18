class array_of_object
{
    String name;
    int id;

    void setData(int i , String n)
    {
        id=i;
        name = n;
    }

    void display()
    {
        System.out.println("ID:"+ id +  "\tName: "+ name);
    }
}
public class Main
{
    public static void main(String args[])
    {
        array_of_object []s = new array_of_object[3];
        s[0]=new array_of_object();
        s[1]=new array_of_object();
        s[2]=new array_of_object();

        s[0].setData(1, "Samagra");
        s[1].setData(2, "Aruansh");
        s[2].setData(3, "Jai");

        for (int i = 0; i < 3; i++) {
            s[i].display();
        }

    }
}