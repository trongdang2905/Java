package object;

public class Circle extends Shape {

    double radius;
    final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public void printResult() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

}
