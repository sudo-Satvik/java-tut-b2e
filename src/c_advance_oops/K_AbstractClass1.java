package c_advance_oops;
// Real example of Abstract class
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing the rectangle...");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing the triangle...");
    }
}
public class K_AbstractClass1 {
    public static void main(String[] args) {
        Shape sh;
        sh = new Rectangle();
        sh.draw();
        sh = new Triangle();
        sh.draw();
    }
}
