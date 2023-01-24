package com.novencia.lawnmower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LawnMowerTest {

    private Lawn lawn = new Lawn(new Coordinate(5,5),new Coordinate(0,0));

    @Test
    void shouldPassTheGivenTest() {
        LawnMower lawnMower1 = new LawnMower(new Position(new Coordinate(1,2),Orientation.get("N")),lawn);
        lawnMower1.execute("GAGAGAGAA");
        assertEquals("1 3 N",lawnMower1.toString());

        LawnMower lawnMower2 = new LawnMower(new Position(new Coordinate(3,3),Orientation.get("E")),lawn);
        lawnMower2.execute("AADAADADDA");
        assertEquals("5 1 E",lawnMower2.toString());
    }
}