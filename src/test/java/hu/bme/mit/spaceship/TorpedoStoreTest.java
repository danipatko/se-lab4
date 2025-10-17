package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        try {
            store.fire(100000);
            fail("Azt vártuk kivételt dob. Nem dobott kivételt.");

        } catch (Exception e) {
        }

    }

    @Test
    void fire_Nothing() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        try {
            store.fire(0);
            fail("Azt vártuk kivételt dob. Nem dobott kivételt.");

        } catch (Exception e) {
        }

    }

    @Test
    void fire_NumberofTorpedoes() {
        // Arrange
        TorpedoStore store = new TorpedoStore(11);
        store.fire(1);
        assertEquals(store.getTorpedoCount(), 10);

    }
}
