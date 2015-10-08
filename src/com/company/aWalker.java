package com.company;

/**
 * Created by TZ6YSQ on 10/7/2015.
 */
public abstract class aWalker implements iWalker{

    private String path;
    private Maze maze;
    private int x, y;

    public aWalker(Maze maze, String path) {
        this.maze = maze;
        this.path = path;
    }

    @Override
    public String attemptToWalk(int startingX, int startingY) {
        Direction startingDirection = Direction.NORTH;

        StringBuilder stringBuilder = new StringBuilder();

        if (!maze.maze[startingX][startingY]){
            return "";
        }

        for (int i = 0; i < 4; i++) {
            /*Try all four directions.*/

            boolean hitWall = false;
            Direction direction = startingDirection;

            x = startingX;
            y = startingY;

            for (char c : path.toCharArray()){
                if (c == 'r'){
                    direction = direction.turnRight();
                }else if (c == 'l'){
                    direction = direction.turnLeft();
                }else {
                    int steps = Integer.parseInt(""+c);
                    for (int j = 0; j < steps; j++) {
                        x +=direction.dx;
                        y += direction.dy;

                        try {
                            if (!maze.maze[x][y]){
                                hitWall = true;
                            }
                        }catch (ArrayIndexOutOfBoundsException e){
                            hitWall = true;
                            break;
                        }
                    }
                }
            }

            if (!hitWall){
                /* Cooredinates reversed to match the output of the challenge. */
                stringBuilder.append();
            }
        }
    }
}
