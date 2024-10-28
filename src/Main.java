public class Main {
    public static void main(String[] args) {
        // Array of Shape
        Shape[] shapesArray = new Shape[3];
        shapesArray[0] = new Triangle();
        shapesArray[1] = new Square();
        shapesArray[2] = new Pentagon();
        // Loop to demonstrate polymorphism
        for (Shape shape : shapesArray) {
// Calls the appropriate overridden method
            shape.displaySides();
// next line
            System.out.println();
        }
    }
}