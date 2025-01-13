abstract class BangunDatar {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

class Circle extends BangunDatar {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends BangunDatar {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * base * height;
    }

    @Override
    public double hitungKeliling() {
        return base + side1 + side2;  // Sum of all sides
    }
}

// Square class that inherits BangunDatar
class Square extends BangunDatar {
    private double side;

    // Constructor to set the side length of the square
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double hitungLuas() {
        return side * side;
    }

    @Override
    public double hitungKeliling() {
        return 4 * side; // Perimeter of square
    }
}

public class shapeclass {
    public static void main(String[] args) {
        // Create instances of different shapes
        BangunDatar circle = new Circle(7); // Circle with radius 7
        BangunDatar triangle = new Triangle(5, 8, 9, 10); // Triangle with base 5 and height 8
        BangunDatar square = new Square(4); // Square with side 4

        // Print the areas of the shapes
        System.out.println("Area of Circle: " + circle.hitungLuas());
        System.out.println("Area of Triangle: " + triangle.hitungLuas());
        System.out.println("Area of Square: " + square.hitungLuas());
    }
}