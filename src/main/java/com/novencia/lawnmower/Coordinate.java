package com.novencia.lawnmower;

/**
 * Coordinate presents a point inside the Lawn
 *
 * @author Hmida Rojbani
 *
 */
public record Coordinate(int x, int y) {

    /**
     * <p>
     *  Change coordinate according to forwarding in a given orientation
     * </p>
     * @param orientation of the lawnmower
     * @return the new coordinate after forward to the given orientation
     *
     */
    public Coordinate forward(Orientation orientation){
        return switch(orientation){
            case NORTH -> new Coordinate(x,y+1);
            case SOUTH -> new Coordinate(x,y-1);
            case EAST -> new Coordinate(x+1,y);
            case WEST -> new Coordinate(x-1,y);
        };

    }
}
