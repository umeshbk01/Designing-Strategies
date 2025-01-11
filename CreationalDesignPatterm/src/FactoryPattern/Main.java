import Shapes.Shape;
import Shapes.ShapeFactory;

public class Main{
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
    }
}