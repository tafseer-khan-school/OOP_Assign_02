package edu.txst.assignment2;

class Circle implements Shape {
    private double radius;


    public double getArea() {
        return 0;
    };

    public String getClassName() {
        return "";
    };

    @Override
    public String toString() {
        return "Circle (r=" + radius + ")";
    };

}
