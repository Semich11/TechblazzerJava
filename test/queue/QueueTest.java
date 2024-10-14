package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void StartAllTestWithThis(){
        queue = new Queue();
    }

    @Test
    @DisplayName("Returns true if this list contains no elements.")
    public void checkIfTheListContainsNoElements() {
        assertTrue(queue.peek());
    }
}
