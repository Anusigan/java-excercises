interface Vehicle{
    void startEngine();
    void stopEngine();

}

class Car implements Vehicle{
    public void startEngine(){
        System.out.println("Engine Started");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped");
    }
}



public class Lab2 {
    
}
