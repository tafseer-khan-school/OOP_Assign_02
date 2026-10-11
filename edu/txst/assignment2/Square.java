package edu.txst.assignment2;

class Square implements Shape {
    private double side;

    public double getArea() {
        return side * side;
    };

    public String getClassName() {
        return "Square";
    };

    @Override
    public String toString() {
        return "Square (s=" + side + ")";
    };

}
