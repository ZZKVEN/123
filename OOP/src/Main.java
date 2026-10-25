public class Main {
    public static void main (String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 4, 5);

        double totalArea_1 = FigureUtil_1.totalArea(circle, rectangle, triangle);
        double totalPerimeter_1 = FigureUtil_1.totalPerimeter(circle, rectangle, triangle);

        System.out.println("\nСуммарная площадь трех фигур : " + totalArea_1);
        System.out.println("Суммарная периметр трех фигур : " + totalPerimeter_1);

        Shape[] shapes = new Shape[] {circle, rectangle, triangle};

        double totalArea_2 = FigureUtil_2.totalArea(shapes);
        double totalPerimeter_2 = FigureUtil_2.totalPerimeter(shapes);

        System.out.println("\nСуммарная площадь всех фигур в массиве: " + totalArea_2);
        System.out.println("Суммарный периметр всех фигур в массиве: " + totalPerimeter_2);
    }
}

