abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape tri = new Triangle();
        Shape hex = new Hexagon();

        rect.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }
}
