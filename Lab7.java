abstract class Vehicle{
     int speed;
    String colour;

    public Vehicle(){
        speed=30;
        colour="Blue";
       
    }
}

class Car extends Vehicle{
    
    public void print(){

        System.out.println(speed);
    }

}


class Bike extends Vehicle{
    public void print(){
        System.out.println(colour);
    }
}
public class Lab7 {

    
}
