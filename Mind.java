class Hi {
    public void Donkey(int n) {
        int add = n * 2;
        System.out.println(add);
    }
}

class Bye extends Hi {
public void monkey (int n){
    int subract=n-1;
    System.out.println(subract);
}

}

public class Mind {
    public static void main(String[] args) {
       Bye sc=new Bye();
       sc.Donkey(10);
    }
    

}
