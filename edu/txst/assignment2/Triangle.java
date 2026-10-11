package edu.txst.assignment2;

/**
 * Triangle implements a displayable shape.
 * A triangle has fields for its base and height.
 */
class Triangle implements Shape {
    private double base;
    private double height;

    /**
     * Creates a triangle with the given base and height.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return .5 * base * height;
    };

    @Override
    public String getClassName() {
        return "Triangle";
    };

    /**
     * Returns a description of the triangle and its dimensions.
     *
     * @return a string in the form {@code Triangle (b=base, h=height)}
     */
    @Override
    public String toString() {
        return "Triangle (b=" + base + ", h=" + height + ")";
    };

}
