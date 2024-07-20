import java.util.Scanner;
public class Initials {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f_name=sc.nextLine();
        f_name=f_name.substring(0,1);
        System.out.println("Enter your surname: ");
        String s_name=sc.nextLine();
        s_name=s_name.substring(0,1);
        System.out.println(f_name+s_name);

    }
    
}
