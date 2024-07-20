import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();
        if(age>=18){
            System.out.println("Over 18");

        }
        else if(age>=0){
            System.out.println("Under 18");
        }
        else{
            System.out.println("the age entered is incorrect");
        }
        sc.close();


    }
    
}
