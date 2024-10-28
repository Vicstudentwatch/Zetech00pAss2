// Base class Shape
public class Shape {
    protected int side; // Store the number of sides
    // Constructor to initialize side
    public Shape(int side) {
        this.side = side;
    }
    // method to be overridden by derived classes
    public void displaySides(){
        for (int i = 1; i <= this.side; i++) {
            System.out.println("Side " + i + "of Shape");
        }
    };
}