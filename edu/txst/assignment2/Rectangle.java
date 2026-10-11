package edu.txst.assignment2;

/**
 * Rectangle implements a displayable shape.
 * A rectangle has fields for its width and length.
 */
class Rectangle implements Shape {
    private final double width;
    private final double length;

    /**
     * Creates a rectangle with the given width and length.
     *
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    };

    @Override
    public String getClassName() {
        return "Rectangle";
    };

    /**
     * Returns a description of the rectangle and its dimensions.
     *
     * @return a string in the form {@code Rectangle (widthxlength)}
     */
    @Override
    public String toString() {
        return "Rectangle (" + width + "x" + length + ")";
    };

}
