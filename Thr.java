class A extends Thread{
   public void show(){
    for (int i=0;i<=10;i++){
    System.out.println("Hi");
    }
   }

}
class B extends Thread{
    public void show(){
    for (int i=0;i<=10;i++){
        System.out.println("Hello");
        }
       }
    

}


public class Thr {
    public static void main(String[] args) {
    A sc=new A();
    B sc1=new B();
    sc.show();
    sc1.show();
        
    }
    

    
}
