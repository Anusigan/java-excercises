class A extends Thread { // now this became thread
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            Thread.sleep(10);
        }
    }

}

class B extends Thread { // now this became thread
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");

        }
    }

}

public class Thr {
    public static void main(String[] args) {
        A sc = new A();
        B sc1 = new B();
        sc.start();
        sc1.start();

    }

}
