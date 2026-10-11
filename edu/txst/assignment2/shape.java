package edu.txst.assignment2;

/**
 * 
 * Shape defines the interface of a shape which contains methods for calculating area and displaying
 * its name
 */
interface Shape {
    /**
     * Calculates the area of the shape.
     *
     * @return the area of the shape
     */
    double getArea();

    /**
     * Gets the display name of the shape.
     *
     * @return the name of the shape class
     */
    String getClassName();
}
