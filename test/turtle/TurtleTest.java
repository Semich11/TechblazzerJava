package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    private Turtle ijapa;
    @BeforeEach
    void startAllTestWithThis() {
         ijapa = new Turtle();
    }

    @Test
    public void newTurtlePenIsUpTest() {
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void turtlePenCanMoveDownTest() {
        assertTrue(ijapa.penIsUp());
        ijapa.penIsDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test
    public void turtlePenCanMoveUpTest() {
        ijapa.penIsDown();
        assertFalse(ijapa.penIsUp());
        ijapa.movePenUp();
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void newTurtleIsFacingNorthTest() {
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }
}
