interface A {
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
