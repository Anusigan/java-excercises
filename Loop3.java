public class Loop3 {
    public static void main(String[] args){
    int count=0;
    while (count<=14){
        if(count==6){
            count+=2;
            continue;
        }
        else{
            System.out.println(count);
            count+=2;
        }
        
    }
    }
    
}
