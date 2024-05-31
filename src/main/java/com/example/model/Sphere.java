package com.example.model;

/**
 * Represents a sphere with a given radius.
 */

public class Sphere {
    
    private double radius;

        /**
     * Constructs a sphere with the given radius.
     *
     * @param radius the radius of the sphere
     * @throws IllegalArgumentException if the radius is not positive
     */

    public Sphere(double radius) {

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }



    /**
     * Gets the radius of the sphere.
     *
     * @return the radius of the sphere
     */


    public double getRadius() {

        return radius;
    }



    /** 
     * Calculates the volume of the sphere using the formula V = (4/3)πr^3.
     * 
     * @return the volume of the sphere 
     */

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}


