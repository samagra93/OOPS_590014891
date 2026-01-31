package LAB2;

import java.util.Scanner;
public class experiment_5 {
    int model_year ;
    int mileage;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        experiment_5 c1 = new experiment_5();
        experiment_5 c2 = new experiment_5();

        System.out.println("Enter model year of car 1");
        c1.model_year=sc.nextInt();

        System.out.println("Enter mileage of car 1");
        c1.mileage=sc.nextInt();

        System.out.println("Enter model year of car 2");
        c2.model_year=sc.nextInt();
        
        System.out.println("Enter mileage of car 2");
        c2.mileage=sc.nextInt();
       
        
        System.out.println("Model of car 1:\t" + c1.model_year);
        System.out.println("Mileage of car 1:\t" + c1.mileage);
        System.out.println("Model of car 2:\t" + c2.model_year);
        System.out.println("Mileage of car 2:\t" + c2.mileage);

        sc.close();
    }
}
