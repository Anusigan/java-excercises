import java.util.Scanner;
public class Sum {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        double num1;
        double num2;
        double sum;
        System.out.println("Enter the number 1: ");
        num1=sc.nextDouble();
        System.out.println("Enter the number 2: ");
        num2=sc.nextDouble();
        sum=num1+num2;
        System.out.println("The sum is: "+sum);
        sc.close();



    }
}
