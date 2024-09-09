class Shape {
    @Override
    double calculateArea(double length, double breadth) {
        return length * breadth;  // Rectangle
    }

    double calculateArea(double side) {
        return side * side;  // Square
    }

    double calculateArea(double radius, boolean isCircle) {
        return 3.1416 * radius * radius;  // Circle
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;  // Triangle
    }
}

public class area {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Rectangle: " + shape.calculateArea(5, 10));
        System.out.println("Area of Square: " + shape.calculateArea(4));
        System.out.println("Area of Circle: " + shape.calculateArea(7, true));
        System.out.println("Area of Triangle: " + shape.calculateArea(6, 8, true));
    }
}
