public class int1{
    public static void main(String [] args){
      int [] num =new int []{10,40,90,60,500,100};
      int large = num[0];
      for(int i : num){
        if(i>large){
            large = i;
        }
        else{
            large=large;
        }
        
    

      }
      System.out.println(large);
    }
}