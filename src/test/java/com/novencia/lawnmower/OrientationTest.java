package com.novencia.lawnmower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrientationTest {

    @Test
    public void shouldTurnCounterClockWise() {

        assertEquals(Orientation.NORTH, Orientation.EAST.turnLeft());
        assertEquals(Orientation.WEST, Orientation.NORTH.turnLeft());
        assertEquals(Orientation.SOUTH, Orientation.WEST.turnLeft());
        assertEquals(Orientation.EAST, Orientation.SOUTH.turnLeft());
    }

    @Test
    public void shouldTurnClockWise() {
        assertEquals(Orientation.NORTH, Orientation.WEST.turnRight());
        assertEquals(Orientation.EAST, Orientation.NORTH.turnRight());
        assertEquals(Orientation.SOUTH, Orientation.EAST.turnRight());
        assertEquals(Orientation.WEST, Orientation.SOUTH.turnRight());
    }

    @Test
    public void shouldTurn360Degree() {
        assertEquals(Orientation.NORTH, Orientation.NORTH.turnRight().turnRight().turnRight().turnRight());
        assertEquals(Orientation.EAST, Orientation.EAST.turnRight().turnRight().turnRight().turnRight());
        assertEquals(Orientation.SOUTH, Orientation.SOUTH.turnRight().turnRight().turnRight().turnRight());
        assertEquals(Orientation.WEST, Orientation.WEST.turnRight().turnRight().turnRight().turnRight());
        assertEquals(Orientation.NORTH, Orientation.NORTH.turnLeft().turnLeft().turnLeft().turnLeft());
        assertEquals(Orientation.EAST, Orientation.EAST.turnLeft().turnLeft().turnLeft().turnLeft());
        assertEquals(Orientation.SOUTH, Orientation.SOUTH.turnLeft().turnLeft().turnLeft().turnLeft());
        assertEquals(Orientation.WEST, Orientation.WEST.turnLeft().turnLeft().turnLeft().turnLeft());
    }

    @Test
    public void shouldReturnOrientationInAlphabet() {
        assertEquals("N", Orientation.NORTH.toString());
        assertEquals("S", Orientation.SOUTH.toString());
        assertEquals("E", Orientation.EAST.toString());
        assertEquals("W", Orientation.WEST.toString());
    }

    @Test
    public void shouldGetOrientationFromAlphabet() {
        assertEquals(Orientation.NORTH, Orientation.get("N"));
        assertEquals(Orientation.SOUTH, Orientation.get("S"));
        assertEquals(Orientation.EAST, Orientation.get("E"));
        assertEquals(Orientation.WEST, Orientation.get("W"));

    }

    @Test
    public void shouldThrowIfGetOrientationFromWrongAlphabet() {
        String wrong="Wrong";
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,()->Orientation.get(wrong));
        assertEquals("\""+wrong+"\" is not accepted as a Orientation", thrown.getMessage());
    }
}
