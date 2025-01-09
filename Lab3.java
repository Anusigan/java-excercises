abstract class Employee{
    public static void getDetails(){
       
        System.out.println("Employee get salary");
    }
    public abstract void calculateSalary(int basic);
}


class Manager extends Employee{
    public void calculateSalary(int basic){
        int salary=basic*4;
        System.out.println("The salary is: "+salary); 
    }

}

public class Lab3 {
    public static void main(String[] args) {
        Employee s=new Manager();
        s.getDetails();
        s.calculateSalary(3000);



    }
    
}


