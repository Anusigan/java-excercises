abstract class Donkey {
    public abstract void running();

    public abstract void singing();

    public void anu() {
        System.out.println("hi");
    }

}

class B extends Donkey{
    public void running(){
        int i=0;
        int j=2;
        System.out.println(i+j);
    }
    public void singing(){
        System.out.println("Hey buddy i can sing well");
    }
}

public class Prac2 {
    Donkey d=new B();
    
   

}
