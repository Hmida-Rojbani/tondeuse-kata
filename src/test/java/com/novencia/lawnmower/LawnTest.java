package com.novencia.lawnmower;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LawnTest {
    private final Coordinate upperRightCorner = new Coordinate(5,5);
    private final Coordinate lowerLeftCorner = new Coordinate(0,0);
    private final Lawn lawn = new Lawn(upperRightCorner,lowerLeftCorner,new ArrayList<>());

    @Test
    void shouldBeInsideLawn() {
        assertTrue(lawn.isInside(upperRightCorner));
        assertTrue(lawn.isInside(lowerLeftCorner));
        assertTrue(lawn.isInside(new Coordinate(1,1)));
    }

    @Test
    void shouldBeOutsideLawn() {
        assertFalse(lawn.isInside(new Coordinate(0,-1)));
        assertFalse(lawn.isInside(new Coordinate(-1,0)));
        assertFalse(lawn.isInside(new Coordinate(5,6)));
        assertFalse(lawn.isInside(new Coordinate(6,5)));
        assertFalse(lawn.isInside(new Coordinate(8,8)));
    }
}