package com.example;

import com.example.model.Sphere;
import com.example.service.FooParameterization;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{

        System.out.println("Enter the radius of the sphere:");
        double radius = scanner.nextDouble();

        Sphere sphere = new Sphere(radius);
        FooParameterization fooParameterization = new FooParameterization();

        double volume = fooParameterization.calculateVolume(sphere);
        System.out.println("The volume of the sphere is: " + volume);

    }
    catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid numeric value for the radius.");
     } finally {
        scanner.close(); 
    }
    }
    
}