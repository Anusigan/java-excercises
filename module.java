import java.util.Scanner;
public class module {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double ict=0;
    double cw=0;
    System.out.println("Enter your marks for ICT: ");
    ict=sc.nextDouble();
    System.out.println("Enter your marks for Cw: ");
    cw=sc.nextDouble();
    if(ict>=30 && cw>=30){
        double f_marks=(ict+cw)/2;
        if(f_marks>=40){
            System.out.println("The final marks is= "+f_marks);
            System.out.println("You are passed");
        }
        else{
            System.out.println("The final marks is= "+f_marks);
            System.out.println("You are failed as final marks<40");
        }
    }
    else{
        System.out.println("You are failed because both modules should be greater than 30 marks");
    }
    sc.close();
    }
    
}
