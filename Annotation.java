 class A{
    public void run(){
        System.out.println("A running");
    }
}



class B extends A{
    @Override
    public void run(){
        System.out.println("B ruuning");
    }
}




public class Annotation {
    public static void main(String[] args) {
        B obj=new B();
        obj.run();
        
    }
    
}
