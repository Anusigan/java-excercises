import java.util.Scanner;
public class Exam12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first  name:");
        String name=sc.nextLine();
        int count=0;
        while(count<name.length()){
            System.out.print("*");
            count++;
        
        }
        sc.close();
    }

    
}
