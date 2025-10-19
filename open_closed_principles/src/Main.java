import calculator.AreaCalculator;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 10),
                new Circle(7)
        };

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total area: " + calculator.totalArea(shapes));
    }
}