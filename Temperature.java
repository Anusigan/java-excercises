import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double c=0;
    double f=0;
    System.out.println("Enter the temperature in centigrade: ");
    c=sc.nextDouble();
    sc.nextLine();
    f=(9.0/5)*c+32;
    System.out.println("The temperature in Farhenit is : "+f+"F");
    sc.close();
}


    
}
