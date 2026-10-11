package edu.txst.assignment2;

/**
 * Square implements a displayable shape.
 * A square has a field for its side length.
 */
class Square implements Shape {
    private final double side;

    /**
     * Creates a square with the given side length.
     *
     * @param side the length of each side of the square
     */
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    };

    @Override
    public String getClassName() {
        return "Square";
    };

    /**
     * Returns a description of the square and its side length.
     *
     * @return a string in the form {@code Square (s=side)}
     */
    @Override
    public String toString() {
        return "Square (s=" + side + ")";
    };

}
