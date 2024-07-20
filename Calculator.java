import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        double result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num01: ");
        double num1=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter num 02: ");
        double num2=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the operation to proceed (+,-,/,*): ");
        char op=sc.next().charAt(0);

        switch(op){
            case '+':{
                result=num1+num2;
                System.out.println("The result is: "+result);
                break;
            }
            case '-':{
                result=num1-num2;
                System.out.println("The reult is: "+result);
                break;
            }
            case'*':{
                result=num1*num2;
                System.out.println("The result is: "+result);  
                break;
            }

            case'/':{
                result=num1/num2;
                System.out.println("The results is: "+result);
                break;
            }

            default:{
                System.out.println("Invalid Operator");
                break;
            }
            
            

            }
            sc.close();
        }
    
    }
    

