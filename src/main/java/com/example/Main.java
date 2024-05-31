package main.java.com.example;

import main.java.com.example.model.Sphere;
import main.java.com.example.service.FooParameterization;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere:");
        double radius = scanner.nextDouble();

        Sphere sphere = new Sphere(radius);
        FooParameterization fooParameterization = new FooParameterization();

        double volume = fooParameterization.calculateVolume(sphere);
        System.out.println("The volume of the sphere is: " + volume);
    }
    
}
