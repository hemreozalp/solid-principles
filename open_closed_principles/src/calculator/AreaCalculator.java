package calculator;

import shapes.Shape;

public class AreaCalculator {
    public double totalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }
}
