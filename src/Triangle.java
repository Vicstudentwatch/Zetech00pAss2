// Derived class Triangle
class Triangle extends Shape {
    // Constructor (3 sides)
    public Triangle() {
        super(3);
    }
    // Overriding the displaySides() method
    @Override
    public void displaySides() {
        for (int i = 1; i <= side; i++) {
            System.out.println("Side " + i + " of Triangle");
        }
    }
}