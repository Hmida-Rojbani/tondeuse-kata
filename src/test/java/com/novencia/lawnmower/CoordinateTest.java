package com.novencia.lawnmower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    private Coordinate coordinate = new Coordinate(2,2);
    private Orientation orientation;

    @Test
    void shouldForwardToNorth() {
        orientation=Orientation.NORTH;
        assertEquals(new Coordinate(2,3),coordinate.forward(orientation));
    }

    @Test
    void shouldForwardToSouth() {
        orientation=Orientation.SOUTH;
        assertEquals(new Coordinate(2,1),coordinate.forward(orientation));
    }

    @Test
    void shouldForwardToEast() {
        orientation=Orientation.EAST;
        assertEquals(new Coordinate(3,2),coordinate.forward(orientation));
    }

    @Test
    void shouldForwardToWest() {
        orientation=Orientation.WEST;
        assertEquals(new Coordinate(1,2),coordinate.forward(orientation));
    }

}