package com.example.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SphereTest {

        @Test
        public void testCalculateVolume() {
            Sphere sphere = new Sphere(3);
            double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(3, 3);
            assertEquals(expectedVolume, sphere.calculateVolume(), 0.0001);
        }

        @Test
        public void testNegativeRadius() {
            assertThrows(IllegalArgumentException.class, () -> {
                new Sphere(-1);
            });
        }

        @Test
        public void testZeroRadius() {
            assertThrows(IllegalArgumentException.class, () -> {
                new Sphere(0);
            });
        }

        @Test
        public void testLargeRadius() {
             Sphere sphere = new Sphere(1000); // Large radius
             double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(1000, 3);
             assertEquals(expectedVolume, sphere.calculateVolume(), 0.0001);
        }

        @Test
        public void testFloatingPointPrecision() {
             Sphere sphere = new Sphere(1.5); // Radius with floating-point value
             double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(1.5, 3);
             assertEquals(expectedVolume, sphere.calculateVolume(), 0.0001);
        }


        @Test
        public void testBoundaryConditions() {
        // Test upper boundary
        Sphere sphereMax = new Sphere(Double.MAX_VALUE);
        // Since the volume exceeds the maximum value, it will be Infinity
        assertEquals(Double.POSITIVE_INFINITY, sphereMax.calculateVolume());

        // Test lower boundary with a negative value
        assertThrows(IllegalArgumentException.class, () -> {
            new Sphere(-1); // Negative value closer to zero
        });
    }

}
