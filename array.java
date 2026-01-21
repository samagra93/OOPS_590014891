import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array:");
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter values in the array:");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();            
        }
         System.out.println("Array");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
                        
        }

        for (int i=0;i<n;i++)
        {
            System.out.print(args[i]);
                        
        }

        sc.close();
    }
}
