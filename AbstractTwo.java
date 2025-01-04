interface A {
    int age=44;
    String area="Mumbai";  // All the variables initialized inside the interface are final and static
    void show();

    void config();

}

interface C extends A{
    void go();
}



class B implements C {
    public void show() {
        System.out.println("How are you?");
    }

    public void config() {
        System.out.println("Fine thats all");
    }
    public void go(){
        System.out.println("Im going!!!");
    }
}

public class AbstractTwo {
    public static void main(String[] args) {
        A sc = new B();
        sc.show();
        System.out.println(A.area);
        C sc1=new B();
        sc1.go();

    }

}
