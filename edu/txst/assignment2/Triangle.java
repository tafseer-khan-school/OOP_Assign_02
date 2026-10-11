package edu.txst.assignment2;

class Triangle implements Shape {
    private double base;
    private double height;

    @Override
    public double getArea() {
        return .5 * base * height;
    };

    @Override
    public String getClassName() {
        return "Triangle";
    };

    @Override
    public String toString() {
        return "Triangle (b=" + base + ", h=" + height + ")";
    };

}
