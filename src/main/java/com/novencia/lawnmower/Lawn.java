package com.novencia.lawnmower;

public record Lawn(Coordinate upperRightCorner, Coordinate lowerLeftCorner) {
    public boolean isInside(Coordinate coordinate){
        return (coordinate.x()>= lowerLeftCorner.x() && coordinate.x() <= upperRightCorner().x())
                &&
                (coordinate.y()>= lowerLeftCorner.y() && coordinate.y() <= upperRightCorner().y());
    }
}
