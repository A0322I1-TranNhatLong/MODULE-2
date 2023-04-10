package ss7_abstract_class_interface.bai_tap.Colorable;

import ss7_abstract_class_interface.bai_tap.Resizeable.Square;

public class Square_Colorable extends Square implements Colorable {
    @Override
    public void howToColor() {
        System.out.println(" Color all four sides ...");
    }

    public Square_Colorable() {
    }

    public Square_Colorable(double side) {
        super(side);
    }

    public Square_Colorable(double side, String color, boolean filled) {
        super(side, color, filled);
    }
}
