public class Rectangle extends GeometricFigure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}
