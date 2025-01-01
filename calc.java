class Calculator{
    public int add(int n1, int n2){
        int sum=n1+n2;
        return(sum);

    }
    public int sub(int n1, int n2){
        int sub=n1-n2;
        return(sub);
    }

   
   
}


class AdvancedCalculator extends Calculator{
    public int multi(int n1 ,int n2){
        int multi=n1*n2;
        return(multi);
    }

}

class VeryAdvancedCalculator extends AdvancedCalculator{
    public int divi(int n1, int n2){
        int divi=n1/n2;
        return(divi);
    }
}

public class calc{
    public static void main(String[] args) {
        VeryAdvancedCalculator sc=new VeryAdvancedCalculator();
        System.out.println(sc.add(10,5));
        
    }
}