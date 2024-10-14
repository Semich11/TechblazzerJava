package turtle;


import static turtle.Direction.EAST;
import static turtle.Direction.SOUTH;
import static turtle.Direction.WEST;
import static turtle.Direction.NORTH;

public class Turtle {
    public Direction currentDirection = EAST;
    private boolean penIsUp = true;
    private void setPenUpState(boolean state) {
        penIsUp = state;
    }
    public boolean penIsUp() {
        return penIsUp;
    }

    public void penIsDown() {
        setPenUpState(false);
    }

    public void movePenUp() {
        setPenUpState(true);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void turnRight(){
        if (getCurrentDirection() == EAST) setCurrentDirection(NORTH);
    }

}
