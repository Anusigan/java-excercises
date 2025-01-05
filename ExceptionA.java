

public class ExceptionA {
    public static void main(String[] args) {
        int i=0;
        try{
        
        int j=18/i;
        System.out.println(j);
        }
        catch (Exception e){
            System.out.println("18 cannot be divided by zero");
        }

    }
    
}
