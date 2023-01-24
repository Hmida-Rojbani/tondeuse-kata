package com.novencia.lawnmower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    private Coordinate coordinate = new Coordinate(2,2);
    private Position position;

    @Test
    void shouldRotateToLeftFromNorthToWest() {
        position = new Position(coordinate,Orientation.NORTH);
        assertEquals(new Position(coordinate,Orientation.WEST),position.rotateToLeft());
    }

    @Test
    void shouldRotateToLeftFromWestToSouth() {
        position = new Position(coordinate,Orientation.WEST);
        assertEquals(new Position(coordinate,Orientation.SOUTH),position.rotateToLeft());
    }

    @Test
    void shouldRotateToLeftFromSouthToEast() {
        position = new Position(coordinate,Orientation.SOUTH);
        assertEquals(new Position(coordinate,Orientation.EAST),position.rotateToLeft());
    }

    @Test
    void shouldRotateToLeftFromEastToNorth() {
        position = new Position(coordinate,Orientation.EAST);
        assertEquals(new Position(coordinate,Orientation.NORTH),position.rotateToLeft());
    }

    @Test
    void shouldRotateToRightFromNorthToEast() {
        position = new Position(coordinate,Orientation.NORTH);
        assertEquals(new Position(coordinate,Orientation.EAST),position.rotateToRight());
    }

    @Test
    void shouldRotateToRightFromWestToNorth() {
        position = new Position(coordinate,Orientation.WEST);
        assertEquals(new Position(coordinate,Orientation.NORTH),position.rotateToRight());
    }

    @Test
    void shouldRotateToRightFromSouthToWest() {
        position = new Position(coordinate,Orientation.SOUTH);
        assertEquals(new Position(coordinate,Orientation.WEST),position.rotateToRight());
    }

    @Test
    void shouldRotateToRightFromEastToSouth() {
        position = new Position(coordinate,Orientation.EAST);
        assertEquals(new Position(coordinate,Orientation.SOUTH),position.rotateToRight());
    }

    @Test
    void shouldMoveForwardInAnyDirection() {
        assertEquals(new Position(new Coordinate(2,3),Orientation.NORTH),new Position(coordinate,Orientation.NORTH).moveForward());
        assertEquals(new Position(new Coordinate(2,1),Orientation.SOUTH),new Position(coordinate,Orientation.SOUTH).moveForward());
        assertEquals(new Position(new Coordinate(3,2),Orientation.EAST),new Position(coordinate,Orientation.EAST).moveForward());
        assertEquals(new Position(new Coordinate(1,2),Orientation.WEST),new Position(coordinate,Orientation.WEST).moveForward());
    }
}