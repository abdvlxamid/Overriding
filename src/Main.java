public class Main {
    public static void main(String[] args) {
        // Создаем фигуры
        GeometricFigure triangle = new Triangle(3, 4, 5);
        GeometricFigure trapezium = new Trapezium(5, 7, 4);
        GeometricFigure rectangle = new Rectangle(4, 6);

        // Выводим информацию о фигурах
        System.out.println("uchburchak:");
        triangle.printInfo();

        System.out.println("\nTrapetsiya");
        trapezium.printInfo();

        System.out.println("\nrectangle:");
        rectangle.printInfo();
    }
}