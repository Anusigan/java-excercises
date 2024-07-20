import java.util.Scanner;
public class Length {
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    double m_length=0;
    double cm_length=0;
    System.out.println("Enter the length in metres: ");
    m_length=sc.nextDouble();
    sc.nextLine();
    cm_length=m_length*100;
    System.out.println("The length in centrimeters is: "+cm_length +"cm");
    sc.close();
    }


    
}
