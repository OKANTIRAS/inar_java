package week_13;



public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "color : " + super.getColor() + " and filled : " + super.isFilled() +
                "\nTriangle  : side1 : " + this.side1 +
                "\nTriangle  : side2 : " + this.side2 +
                "\nTriangle  : side3 : " + this.side3;
    }

    @Override
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.pow(s * (s - this.side1) *
                (s - this.side2) * (s - this.side3), 0.5);
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }



}
