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

class Bike implements Vehicle{
    public void startEngine(){
        System.out.println(" Engine Started for Bike");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped for Bike");
    }
}



public class Lab2 {
    public static void main(String[] args) {
        
        
    }
    
}
