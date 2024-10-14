package javascript;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void testArrayReverse(){
        Task task = new Task();
        int[] array = {1,2,3,4,5};
        int[] reverseArray = task.arrayReverse(array);
        int[] expected = {5,4,3,2,1};
        String reverseString = Arrays.toString(reverseArray);
        assertArrayEquals(expected, reverseArray);
    }

    @Test
    public void secondTestArrayReverse() {
        Task task = new Task();
        int[] array = {4,5,2,1,6};
        int[] reverseArray = task.arrayReverse(array);
        int[] expected = {6,1,2,5,4};
        String reverseString = Arrays.toString(reverseArray);
        assertArrayEquals(expected, reverseArray);
    }

}
