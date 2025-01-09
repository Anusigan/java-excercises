interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("I can swim");
    }
    public void swim(){
        
    
    }

}

public class Lab6 {

}
