
import object.Circle;
import object.Rectangle;
import object.Triangle;

public class CalculateAreaAndPerimeter {

    private double width;
    private double length;
    private Triangle triangle;
    private double radius;
    private Circle circle;

    private double sideA;
    private double sideB;
    private double sideC;
    private Rectangle rec;

    public void getValidInput() {
        this.width = GetData.getDouble("Please input side width of Rectangle: ");
        this.length = GetData.getDouble("Please input length of Rectangle:");
        this.rec = new Rectangle(width, length);
        this.radius = GetData.getDouble("Please input radius of Circle:");
        this.circle = new Circle(radius);
        // Vong lap kiem nhap canh tam giac va kiem tra xem no co phai tam giac khong?
        while (true) {
            this.sideA = GetData.getDouble("Please input side A of Triangle:");
            this.sideB = GetData.getDouble("Please input side B of Triangle:");
            this.sideC = GetData.getDouble("Please input side C of Triangle:");
            // Kiem tra xem 3 canh nay co tao nen 1 tam giac hay khong?
            if (this.sideA + this.sideB > this.sideC
                    && this.sideA + this.sideC > this.sideB
                    && this.sideB + this.sideC > this.sideA) {
                this.triangle = new Triangle(sideA, sideB, sideC);
                break;
            }
            System.out.println("It is not three side of triangle, please enter again!");
        }
    }

    public void displayResult() {
        System.out.println("-----Rectangle-----");
        rec.printResult();
        System.out.println("-----Circle-----");
        circle.printResult();
        System.out.println("-----Triangle-----");
        triangle.printResult();
    }
}
