class A{
    public A(){
        System.out.println("Donkey");
    }

}

class B extends A{
    public B (){
        System.out.println("Hi");
    }

}

public class inh{
    public static void main(String[] args) {
        B obj = new B();
    }
}