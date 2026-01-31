package LAB2;

// WAP TO CHECK WHETHER AN ARRAY CONTAIN DUPLICATE ELEMENT OF NOT
import java.util.Scanner;

class ArrayData{
    int n;
    int []arr;
}
public class experiment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayData a1= new ArrayData();
        System.out.println("Enter the length of the array: ");
        a1.n=sc.nextInt();
        a1.arr = new int[a1.n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < a1.n; i++)
        {
            a1.arr[i]=sc.nextInt();
        }
        boolean duplicate = false;

        for (int i=0;i<a1.n; i++)
        {
            for(int j=i+1;j<a1.n;j++)
            {
                if(a1.arr[i]==a1.arr[j])
                {
                    duplicate=true;
                    break;
                }
            }
        if (duplicate==true)
        {
            break;
        }
        }

        if(duplicate)
        {
            System.out.println("Array has duplicate element");
        }
        else 
        {
            System.out.println("Array has no duplicate element");
        }

        sc.close();
}
}
