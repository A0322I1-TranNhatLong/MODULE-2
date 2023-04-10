package ss7_abstract_class_interface.bai_tap.Colorable;

import ss6_ke_thua.bai_tap.Triangle.Shape;
import ss7_abstract_class_interface.bai_tap.Resizeable.Circle;
import ss7_abstract_class_interface.bai_tap.Resizeable.Rectangle;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square_Colorable(3, "Red", true);
        shapes[1] = new Circle(3);
        shapes[2] = new Rectangle(3, 5);
        shapes[3] = new Circle(6, "Black", true);

        for (Shape shape : shapes) {
            if (shape instanceof Square_Colorable) {
                Square_Colorable square_colorable = (Square_Colorable) shape;
                System.out.println(" Đối tượng Square_Colorable có S = " + square_colorable.getArea());
                square_colorable.howToColor();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(" Đối tượng Circle có S = " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Đối tượng Rectangle có S = " + rectangle.getArea());
            }
        }
    }
}
