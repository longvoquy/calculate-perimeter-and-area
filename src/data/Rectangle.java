package data;

public class Rectangle extends Shape {
    private double w;
    private double l;

    public Rectangle() {
    }

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }

    @Override
    public double getPerimeter() {
        return (w + l) * 2;
    }

    @Override
    public double getArea() {
        return w * l;

    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width:  "+this.w);
        System.out.println("Length:  "+this.l);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
