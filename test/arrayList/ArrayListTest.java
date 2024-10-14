package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {
    private ArrayList arrayList;

    @BeforeEach
    public void StartAllTestWithThis(){
        arrayList = new ArrayList();
    }

    @Test
    @DisplayName("Returns true if this list contains no elements.")
    public void checkIfTheListContainsNoElements() {
        assertTrue(arrayList.isEmpty());
    }

    @Test
    @DisplayName("Returns False if this list contains elements.")
    public void checkWhenAnElementIsAddedThatListIsNotEmpty() {
        arrayList.add("G-string");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    @DisplayName("Add element to a specified position and returns the element at the specified position in this list.")
    public void testThatGetMethodWillReturnElementAtASpecifiedPosition() {
        arrayList.add(0, "G-string");
        arrayList.add(1, "F-string");
        assertEquals("F-string", arrayList.get(1));
    }

    @Test
    @DisplayName("Returns the number of elements in this list.")
    public void testThatSizeMethodWillReturnNumberOfElements() {
        arrayList.add("G-string");
        arrayList.add("F-string");
        assertEquals(2, arrayList.size());
    }

    @Test
    @DisplayName("Replaces the element at the specified position in this list with the specified element.")
    public void testThatSetMethodWillReplaceElementAtASpecifiedPositionAndReturnThePreviousElement() {
        arrayList.add("G-string");
        arrayList.add("F-string");
        assertEquals("F-string", arrayList.set(2, "E-string"));
    }

    @Test
    @DisplayName("If the index is out of range.")
    public void testThatSetMethodWillThrowIndexOutOfBoundsExceptionIfIndexIsOutOfRange() {
        arrayList.add("G-string");
        arrayList.add("F-string");
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.set(3, "E-string");});
    }

}
