public class Trapezium extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public double area() {
        return (sideA + sideB) * high / 2;
    }

    @Override
    public double perimeter() {
        double sideC = Math.sqrt(Math.pow((sideB - sideA)/2, 2) + Math.pow(high, 2));
        return sideA + sideB + 2 * sideC;
    }
}