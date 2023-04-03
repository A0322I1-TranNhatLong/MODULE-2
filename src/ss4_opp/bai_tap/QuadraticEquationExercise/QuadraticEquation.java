package ss4_opp.bai_tap.QuadraticEquationExercise;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //constructor mặc định
    public QuadraticEquation() {

    }

    ////constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getGetRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getGetRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }
}
