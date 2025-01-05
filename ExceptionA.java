

public class ExceptionA {
    public static void main(String[] args) {
        int i=0;
        int nums[]=new int[5];
        try{
        int j=18/2;
        System.out.println(nums[1]);
        System.out.println(nums[5]);
        System.out.println(j);
        }
        catch (Exception e){
            System.out.println("18 cannot be divided by zero"+ e);
        }

    }
    
}
