import java.util.Scanner;
public class Wages {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int manual=0;
    int skill=0;
    int manage=0;
    System.out.println("Enter the number of manual people in the company: ");
    manual=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the number of skilled people in the company:  ");
    skill=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the number of manage people in the company: ");
    manage=sc.nextInt();
    sc.nextLine();
    double t_wages=(manual*500)+(skill*700)+(manage*800);
    double tax=0.2*t_wages;
    System.out.println("The total wages is: "+t_wages);
    System.out.println("The tax to be paid is: "+tax);
    sc.close();

    
}
}
