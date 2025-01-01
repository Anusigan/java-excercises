class calculator{
    public int add(int n1, int n2){
        int sum=n1+n2;
        return(sum);

    }
    public int sub(int n1, int n2){
        int sub=n1-n2;
        return(sub);
    }

    public int multi(int n1 ,int n2){
        int multi=n1*n2;
        return(multi);
    }
    public int divi(int n1, int n2){
        int divi=n1/n2;
        return(divi);
    }
}

public class calc{
    public static void main(String[] args) {
        calculator sc=new calculator();
        sc.multi(10,5);
        
    }
}