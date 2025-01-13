class A implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
        }

    }

}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
        }
    }
}

