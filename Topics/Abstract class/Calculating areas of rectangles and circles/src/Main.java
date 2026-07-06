import java.util.Scanner;

// Define the abstract Shape class with an abstract area() method
abstract class Shape {
    public abstract double area();
}

// Implement the Rectangle class that extends Shape
class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;

    }
    @Override
    public double area() {
        return length * width;
    }
}


// Implement the Circle class that extends Shape
class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the rectangle
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Read the radius of the circle
        double radius = scanner.nextDouble();

        // Create instances of Rectangle and Circle
        Shape rectangle = new Rectangle(length, width);
        Shape circle = new Circle(radius);

        // Calculate and print the area of the rectangle
        System.out.println(rectangle.area());

        // Calculate and print the area of the circle
        System.out.println(circle.area());

        scanner.close();
    }
}