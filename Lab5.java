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
        if (stype=="Circle"){
            return new Circle();
        }
        else if (stype=="Square"){
            return new Square();
        }
        else if (stype=="Triangle"){
            return new Triangle();
        }
        else{
            return null;
        }

    }

}






public class Lab5 {
    public static void main(String[] args) {
        System.out.println("Enter the shape typle");
        Scanner sc=new Scanner(System.in);
        String stype=sc.nextLine();

        ShapeFactory f=new ShapeFactory();
        Shape circle=f.getShape(stype);
        Shape square=f.getShape(stype);
        Shape triangle=f.getShape(stype);


        circle.draw();
        triangle.draw();
        square.draw();
        
    }
    
}
