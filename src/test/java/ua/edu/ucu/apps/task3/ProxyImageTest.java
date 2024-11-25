package ua.edu.ucu.apps.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyImageTest {

    @Test
    public void testProxyImageLazyLoading() {
        String filename = "test-image.jpg";
        ProxyImage proxyImage = new ProxyImage(filename);
        assertNotNull(proxyImage, "ProxyImage instance should not be null.");

        try {
            var realImageField = ProxyImage.class.getDeclaredField("realImage");
            realImageField.setAccessible(true);
            RealImage realImage = (RealImage) realImageField.get(proxyImage);
            assertNull(realImage, "RealImage should not be instantiated until display() is called.");
        } catch (Exception e) {
            fail("Reflection failed to validate lazy-loading mechanism: " + e.getMessage());
        }

        try {
            proxyImage.display();
        } catch (Exception e) {
            fail("ProxyImage display() should not throw any exception: " + e.getMessage());
        }

        try {
            var realImageField = ProxyImage.class.getDeclaredField("realImage");
            realImageField.setAccessible(true);
            RealImage realImage = (RealImage) realImageField.get(proxyImage);
            assertNotNull(realImage, "RealImage should be instantiated after display() is called.");
        } catch (Exception e) {
            fail("Reflection failed to validate RealImage instantiation: " + e.getMessage());
        }
    }

    @Test
    public void testRealImageDisplay() {
        String filename = "test-image.jpg";

        try {
            RealImage realImage = new RealImage(filename);
            assertNotNull(realImage, "RealImage instance should not be null.");

            realImage.display();
        } catch (Exception e) {
            fail("RealImage display() should not throw an exception for valid files: " + e.getMessage());
        }
    }
}
