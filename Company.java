
interface Computer{
    public  abstract void code();

}


class Laptop implements Computer{
    public void code(){
        System.out.println( "Laptop is starting and running code");
    }

}

class Desktop implements Computer{
    public void code(){
        System.out.println("Faster Desktop");
    }
}
class Worker{
    public void work(Computer apple){
        apple.code();
    }
}



public class Company {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer lap2=new Desktop();
        Worker Anusigan=new Worker();
        Anusigan.work(lap);
        Worker Akilesh=new Worker();
        Akilesh.work(lap2);

    }
    
}
