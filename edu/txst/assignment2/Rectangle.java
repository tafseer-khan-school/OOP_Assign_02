package edu.txst.assignment2;

class Rectangle implements Shape {
    private double width;
    private double length;

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
