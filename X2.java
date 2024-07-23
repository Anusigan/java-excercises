public class X2 {
    public static void main(String[] args) {
        int count=0;
        while(count<100){
            if(count%2==0){
                System.out.println(count);
                count++;
            }
            else{
                count++;
                continue;

            }
        }
    }
    
}
