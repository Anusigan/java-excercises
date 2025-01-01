
class A{
    public void run(int n1 ,int n2){
        System.out.println(n1+n2);
    }
    public void man (){
        System.out.println("Bye");

    }
    
}
class B extends A{
    public void run(int n1,int n2){
        System.out.println(n1+n2+1);
    }

}


public class override {
    public static void main(String[] args) {
        
    
    B obj =new B();
    obj.run(5,6);
    obj.man();
    
    
}
}
