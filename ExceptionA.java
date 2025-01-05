
class MyException extends Exception{

    public MyException(String anu){
        super(anu);

    }
}
public class ExceptionA {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
         j=18/i;
         if(j==0){
            
           throw new MyException("hi");
         }



       
        
        }
        catch (MyException e){
            System.out.println("custom"+e);
        }
       
       catch(Exception e){
        System.out.println("ll");
       }
       
        

    }
    
}
