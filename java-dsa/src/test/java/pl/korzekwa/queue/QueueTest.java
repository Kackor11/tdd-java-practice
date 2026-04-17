package pl.korzekwa.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void shouldBeEmptyWhenCreated() {
        
        // Arrange
        Queue<Integer> queue = new Queue<>();

        // Act
        boolean result = queue.isEmpty();

        // Assert
        assertTrue(result, "Newly created queue should be empty");
    }
}