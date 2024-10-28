// Derived class Pentagon
class Pentagon extends Shape {
    // Constructor (5 sides)
    public Pentagon() {
        super(5);
    }
    // Overriding the displaySides() method
    @Override
    public void displaySides() {
        for (int i = 1; i <= side; i++) {
            System.out.println("Side " + i + " of Pentagon");
        }
    }
}