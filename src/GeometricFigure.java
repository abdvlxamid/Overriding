public abstract class GeometricFigure {
    public abstract double area();
    public abstract double perimeter();


    public void printInfo() {
        System.out.println("area: " + area());
        System.out.println("perimeter: " + perimeter());
    }
}


