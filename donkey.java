import java.util.Scanner;
public class donkey{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int []numbers=new int[5];
for(int i=0;i<numbers.length;i++){
System.out.println("Enter the number: ");
int num=sc.nextInt();
numbers[i]=num;
}
for(int j=0;j<numbers.length;j++){
System.out.println(numbers[j]);
}
}

}