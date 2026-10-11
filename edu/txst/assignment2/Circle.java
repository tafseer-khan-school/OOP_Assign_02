package edu.txst.assignment2;

/**
 * Circle implements a displayable shape.
 * A circle has a field for its radius.
 */
class Circle implements Shape {
    private final double radius;

    /**
     * Creates a circle with the given radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    };

    @Override
    public String getClassName() {
        return "Circle";
    };

    /**
     * Returns a description of the circle and its radius.
     *
     * @return a string in the form {@code Circle (r=radius)}
     */
    @Override
    public String toString() {
        return "Circle (r=" + radius + ")";
    };

}
