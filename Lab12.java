class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }
}

class X extends Thread {
    public void run() {
        for (int i = 10; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

public class Lab12 {
    public static void main(String[] args) {
            B anu=new B();
            X aksi=new X();
            

            anu.start();
            aksi.start();


    }
    sout    

}
