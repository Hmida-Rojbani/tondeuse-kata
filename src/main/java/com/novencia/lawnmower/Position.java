package com.novencia.lawnmower;

/**
 * presents the coordinate and orientation of the lawnmower
 * @param coordinate the point where the lawnmower in the lawn
 * @param orientation the orientation of the lawnmower
 */
public record Position(Coordinate coordinate, Orientation orientation) {

    /**
     *
     * @return new Position with orientation rotate to left
     */
    public Position rotateToLeft(){
        return new Position(coordinate,orientation.turnLeft());
    }

    /**
     *
     * @return new Position with orientation rotate to right
     */
    public Position rotateToRight(){
        return new Position(coordinate,orientation.turnRight());
    }

    /**
     *
     * @return new Position with a coordinate changed after moving forward
     */
    public Position moveForward(){
        return new Position(coordinate.forward(orientation),orientation);
    }

}
