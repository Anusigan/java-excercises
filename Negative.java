import java .util.Scanner;
public class Negative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num=0;
        double sum=0;
        while(true){
            System.out.println("Enter the number: ");
            num=sc.nextDouble();
            if(num<0){
                break;
            }
            else{
                sum+=num;
            }


        }
        System.out.println("The sum is: "+sum);
        sc.close();
    }
    
}
