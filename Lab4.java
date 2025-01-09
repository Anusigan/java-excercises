abstract class Shape{
    public abstract void draw();
}


class Circle extends Shape{
    public void draw(){
        System.out.println("Drwaing a Circle");

    }

}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing a Square");
    }
}

public class Lab4 {
    public static void main(String[] args) {
        Shape c1=new Circle();
        Shape s1=new Square();
        c1.draw();
        s1.draw();
    }

    
}
