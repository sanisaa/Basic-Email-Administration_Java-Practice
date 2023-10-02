package practice;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Circle(); // Polymorphism: Circle is treated as a Shape

        shape1.draw(); // Calls the draw method in Shape
        shape2.draw(); // Calls the overridden draw method in Circle
    }
}

