package com.company;

/**
 * Created by TZ6YSQ on 10/7/2015.
 */
public enum Direction {

    NORTH(0, -1, 0),
    EAST(1, 0, 1),
    SOUTH(2, 1, 0),
    WEST(3, 0, -1);
    public final int dx, dy;
    private final int turnRightIndex, turnLeftIndex;

    Direction(int ordinal, int x, int y) {
        this.dx = x;
        this.dy = y;
        this.turnRightIndex = (ordinal+1) % 4;
        this.turnLeftIndex = (ordinal+3) % 4;
    }

    public Direction turnRight(){
        return values()[turnRightIndex];
    }

    public Direction turnLeft(){
        return values()[turnLeftIndex];
    }
}
