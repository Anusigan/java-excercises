import java.util.*;
public class Exam11 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name=sc.nextLine();
    for(int i=0;i<name.length();i++){
        System.out.print("*");
    }
    sc.close();
    
}
}
