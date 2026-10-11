package edu.txst.assignment2;

class Rectangle implements Shape {
    private final double width;
    private final double length;

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

    @Override
    public String toString() {
        return "Rectangle (" + width + "x" + length + ")";
    };

}
