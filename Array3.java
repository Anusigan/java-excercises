import java.util.Scanner;
public class Array3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] numbers=new int[4];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the number: ");
            int element=sc.nextInt();
            sc.nextLine();
            numbers[i]=element;

        }
        
        for(int a:numbers){
            System.out.println(a);
        }
        sc.close();
    }

    
}
