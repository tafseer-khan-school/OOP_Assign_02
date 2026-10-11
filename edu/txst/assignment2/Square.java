package edu.txst.assignment2;

class Square implements Shape {
    private double side;

    @Override
    public double getArea() {
        return side * side;
    };

    @Override
    public String getClassName() {
        return "Square";
    };

    @Override
    public String toString() {
        return "Square (s=" + side + ")";
    };

}
