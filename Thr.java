class A extends Thread { // now this became thread
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

class B extends Thread { // now this became thread
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }

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
