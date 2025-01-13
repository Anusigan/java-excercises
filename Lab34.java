class A implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
        }

    }

}



public class Lab34 {
    public static void main(String[] args) {
        Runnable sc=new A();
        Runnable sc1=new B();

        Thread a=new Thread(sc);
        Thread b=new Thread(sc1);

        a.start();
        b.start();
    }

}
