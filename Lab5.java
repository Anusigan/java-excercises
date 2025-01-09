import java.util.Scanner;


interface Shape{
    void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing a Circle");
    }
    
}

class Square implements Shape{
    public void draw(){
        System.out.println("Drawing a Square");
    }
}

class Triangle implements Shape{
    public void draw(){
        System.out.println("Drawing a Triangle");
    }
}


class ShapeFactory{
    public Shape getShape(String stype){
        if (stype.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (stype.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if (stype.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        else{
            return null;
        }

    }

}






public class Lab5 {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape typle");
        String stype=sc.nextLine();

        ShapeFactory f=new ShapeFactory();
        Shape shape=f.getShape(stype);
       


       shape.draw();
    }
    
}
