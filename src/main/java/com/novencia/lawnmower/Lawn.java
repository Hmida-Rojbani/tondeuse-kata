package com.novencia.lawnmower;

public record Lawn(Coordinate upperRightCorner, Coordinate lowerLeftCorner) {
    /**
     * Test if the coordinate is inside the space limit of the lawn
     * @param coordinate to test
     * @return true if the coordinate is inside the lawn
     */
    public boolean isInside(Coordinate coordinate){
        return (coordinate.x()>= lowerLeftCorner.x() && coordinate.x() <= upperRightCorner().x())
                &&
                (coordinate.y()>= lowerLeftCorner.y() && coordinate.y() <= upperRightCorner().y());
    }
}
