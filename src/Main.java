import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int [] marks=new int[6];
        int first=0;
        int second=0;
        int third=0;
        int fourth=0;
        int fifth=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the mark: ");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);


        }
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=70){
                first+=1;
                System.out.println("The number of students who above 70 are: "+first);
            }
            else if(marks[i]>=60){
                second+=1;
                System.out.printf("The number of students who above 60 are: "+second);
            }
            else if(marks[i]>=50){
                third+=1;
                System.out.println("The number of students who above 50 are: "+third);

            }
            else if(marks[i]>=40){
                fourth+=1;
                System.out.println("The number of students who above 40 are: "+fourth);
            }
            else{
                fifth+=1;
                System.out.println("The students got failed are: "+fifth);
            }
        }
    }
}