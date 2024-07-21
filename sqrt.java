public class sqrt {
    public static void main(String[] args){
        int num=1;
        int sum=0;
        do{
            int sqr=num*num;
           sum=sum+sqr;
           num++;
        }
        while(num<5);{
            System.out.println(sum);


        }
    }
    
}
