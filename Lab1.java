abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Wowww");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Meowwww");
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Animal c=new Cat();
        Animal d=new Dog();

        c.sound();
        d.sound();
        
    }
    


}
