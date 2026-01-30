import java.util.Scanner;
public class static1 {
    //static int n;
    int n;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        static1 m = new static1();
        //int n;
        System.out.println("Input:");
        m.n=s.nextInt();
       // n=s.nextInt();
        //System.out.println(n);
        System.out.println(m.n);
        s.close();
        
    }
}
