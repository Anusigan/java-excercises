abstract class Vehicle{
     int speed;
    String colour;

    public Vehicle(){
        speed=30;
        colour="Blue";
       
    }
}

class Car extends Vehicle{
    
    public void printa(){

        System.out.println(speed);
    }

}


class Bike extends Vehicle{
    public void printa(){
        System.out.println(colour);
    }
}
public class Lab7 {
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike=new Bike();
        car.printa();
        bike.printa();

    }

    
}
