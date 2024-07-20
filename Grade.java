import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the indicator score: ");
    double score=sc.nextDouble();
    sc.nextLine();
    if(score>100){
        System.out.println("Invalid value");
    }
    else if (score>=70){
        System.out.println("1st Class Honours(1)");
    }
    else if(score>=60){
        System.out.println("2nd Class Honours Upper Division (2:i)");
    }
    else if(score>=50){
        System.out.println("2nd class Honours Lower Division (2:ii)");
    }
    else if(score>=40){
        System.out.println("3rd Class Honours(3)");
    }
    else{
        System.out.println("Invalid value2");
    }
    sc.close();

   
    }
}
