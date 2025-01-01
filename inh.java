class A  extends Object{
    public A() {
        System.out.println("Donkey");
    }

    public A(int n) {
        System.out.println("Ok fine");
    }

}

class B extends A {
    public B() {
        System.out.println("Hi");
    }

    public B (int n){
        super (n);
        System.out.println("int B int");
    }

}

public class inh {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}