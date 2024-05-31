package test.java.com.example.model;

public class SphereTest {
    
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
}
