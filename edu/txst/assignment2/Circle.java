package edu.txst.assignment2;

class Circle implements Shape {
    private double radius;

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    };

    public String getClassName() {
        return "Circle";
    };

    @Override
    public String toString() {
        return "Circle (r=" + radius + ")";
    };

}
