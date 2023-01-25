package com.novencia.lawnmower;

import java.util.ArrayList;
import java.util.List;

public record Lawn(Coordinate upperRightCorner, Coordinate lowerLeftCorner, List<LawnMower> lawnMowers) {
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

    public boolean isEmpty(Coordinate coordinate){
        return lawnMowers.stream().noneMatch(lawnMower -> lawnMower.getPosition().coordinate().equals(coordinate));
    }

    public void addLawnMower(LawnMower lawnMower) {
        lawnMowers.add(lawnMower);
    }
}
