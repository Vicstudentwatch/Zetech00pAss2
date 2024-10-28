// Derived class Square
class Square extends Shape {
    // Constructor (4 sides)
    public Square() {
        super(4);
    }
    // Overriding the displaySides() method
    @Override
    public void displaySides() {
        for (int i = 1; i <= side; i++) {
            System.out.println("Side " + i + " of Square");
        }
    }
}