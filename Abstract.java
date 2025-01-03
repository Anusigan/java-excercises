class Car {
    public void drive();

    // not implementing this method
    public void skate() {
        System.out.println("Play Music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("This car will drive");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car sc = new Car();
        sc.drive();
        sc.skate();
    }

}
