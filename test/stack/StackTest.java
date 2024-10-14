package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;
    @BeforeEach
    public void startEveryTestWithThis() {
        stack = new Stack(3);
    }

    @Test
    public void newStack_isEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneElement_stackIsNotEmptyTest(){
        stack.push("G_String");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popX_stackIsEmptyTest(){
       stack.push("X_String");
       String returned = stack.pop();
       assertTrue(stack.isEmpty());

    }

    @Test
    public void pushXY_popY_stackIsNotEmptyTest(){
        stack.push("G_String");
        stack.push("X_String");
        String returned = stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushY_popYTest(){
        stack.push("Y_String");
        String returned = stack.pop();
        assertEquals("Y_String", returned);
    }

    @Test
    public void pushXYZ_stackIsFullTest(){
        stack.push("X_String");
        stack.push("Y_String");
        stack.push("Z_String");
        assertTrue(stack.isFull());
    }

    @Test
    public void pushXY_stackIsNotFullTest(){
        stack.push("X_String");
        stack.push("Y_String");
        assertFalse(stack.isFull());
    }

    @Test
    public void willThrowException_ifStackIsEmptyTest(){
        stack.push("X_String");
        stack.push("Y_String");
        stack.push("Z_String");
        assertTrue(stack.isFull());
        assertThrows(IllegalArgumentException.class, ()-> stack.push("No_String"));
    }

    @Test
    public void pushXYZ_popZ_sizeIsTwoTest(){
        stack.push("X_String");
        stack.push("Y_String");
        stack.push("Z_String");
        stack.pop();
        assertEquals(2, stack.size());
    }

    @Test
    public void pushXYZ_popZYX_Test(){
        stack.push("X_String");
        stack.push("Y_String");
        stack.push("Z_String");
        assertEquals("Z_String", stack.pop());
        assertEquals("Y_String", stack.pop());
        assertEquals("X_String", stack.pop());
    }
}
