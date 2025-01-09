interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("I can fly");
    }
    public void swim(){
        System.out.println("I can swim");
    
    }

}

public class Lab6 {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();
    }

}
