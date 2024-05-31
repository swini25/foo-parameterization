package main.java.com.example.model;

public class Sphere {
    
    private double radius;

    public Sphere(double radius) {

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }


    public double getRadius() {

        return radius;
    }


    /** 
     * Calculates the volume of the sphere. 
     * 
     * @return volume of the sphere 
     */

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
