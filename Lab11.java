interface A{
    void fly();
    void jump();
}


class B implements A{
    public void fly(){
        System.out.println("Im flying");
    }
    public void jump(){
        System.out.println("Anusigan");
    }
}



public class Lab11 {
    public static void main(String[] args) {
        B bird=new B();
        A anu=new B();
        

    }

    
}
