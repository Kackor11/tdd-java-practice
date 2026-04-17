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

    @Test
    void shouldNotBeEmptyAfterEnqueue() {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);

        assertFalse(queue.isEmpty(), "Queue should not be empty after adding a new element");
    }

    @Test
    void shouldMaintainOrderAfterMultipleEnqueues() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.head.value, "First element should have value 10");
        assertEquals(20, queue.head.next.value, "Second element should have value 20");
        assertEquals(30, queue.head.next.next.value, "Third element should have value 30");
    }

    @Test
    void shouldReturnCorrectValueOnDequeue() {
        Queue<Integer> queue = new Queue<>();
        
        queue.enqueue(100);
        queue.enqueue(200);

        Integer result = queue.dequeue();

        assertEquals(100, result, "Dequeue should return the first added element (100)");
        assertFalse(queue.isEmpty(), "Queue should not be empty, el 200 is left there");
    }

    @Test
    void shouldBeEmptyAfterDeletingAllElements() {
        Queue<String> queue = new Queue<>();

        queue.enqueue("Test");

        queue.dequeue();

        assertTrue(queue.isEmpty(), "Queue should be empty after deleting the only element");
    }
}