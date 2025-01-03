abstract class Car {
    public abstract void  drive();

    // not implementing this method
    public void skate() {
        System.out.println("Play Music");

    }
    public abstract void fly();
    
}


abstract class WagonR extends Car {
    public void drive() {
        System.out.println("This car will drive");
    }
}

class UpWagonR extends WagonR{      //Concrete class
    public void fly(){
        System.out.println("Im flying");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car sc = new UpWagonR();
        sc.drive();
        sc.skate();
        sc.fly();
    }

}
