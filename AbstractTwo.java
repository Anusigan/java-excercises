interface A {
    int age=44;
    String area="Mumbai";  // All the variables initialized inside the interface are final and static
    void show();

    void config();

}

class B implements A {
    public void show() {
        System.out.println("How are you?");
    }

    public void config() {
        System.out.println("Fine thats all");
    }
}

public class AbstractTwo {
    public static void main(String[] args) {
        A sc = new B();
        sc.show();

    }

}
