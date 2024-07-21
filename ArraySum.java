import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        int [] numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num=0;
        for(int i=0;i<numbers.length;i++){
            System.out.println("enter a number: ");
            num=sc.nextInt();
            sc.nextLine();
            sum=sum+num;

        }
        System.out.println("The sum is: "+sum);
        sc.close();

    }
    
}
