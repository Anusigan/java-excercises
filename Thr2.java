class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi Anu");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi Shahi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}







public class Thr2  {

    public static void main (String[] args){

    //Creating the Objects
    Runnable sc=new A();
    Runnable sc1=new B();


    //Creating the threads
    Thread t1=new Thread(sc);
    Thread t2=new Thread(sc1);

    t1.start();
    try{
        Thread.sleep(6);
    }
    catch(InterruptedException e){
        e.printStackTrace();

    }

    t2.start();

    
}
}
