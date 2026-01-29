import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
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
            sum=sum+arr[i];
                        
        }
        System.out.println("Sum of array:"+ sum);
        sc.close();
    }
}
