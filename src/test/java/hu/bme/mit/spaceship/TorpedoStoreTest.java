package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void isEmpty() {
        // Arrange
        TorpedoStore store1 = new TorpedoStore(1);
        TorpedoStore store2 = new TorpedoStore(0);

        // Assert
        assertEquals(false, store1.isEmpty());
        assertEquals(true, store2.isEmpty());
    }

    @Test
    void getCount() {
        // Arrange
        TorpedoStore store = new TorpedoStore(5);

        // Assert
        assertEquals(5, store.getTorpedoCount());
    }

    @Test
    void fire_fails() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1, 1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(false, result);
    }

    @Test
    void illegalArgument() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        assertThrows(IllegalArgumentException.class, () -> {store.fire(-1);});

        // Assert
    }
}
