

public class ExceptionA {
    public static void main(String[] args) {
        int i=0;
        
        int j=0;
        try{
         j=18/i;
         


       
        
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(j);

    }
    
}
