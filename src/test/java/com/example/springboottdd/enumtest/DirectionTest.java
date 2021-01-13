package com.example.springboottdd.enumtest;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    void testDirectionOrdinal(){
        assertEquals(Direction.EAST.ordinal(), 0);
    }

    @Test
    void testDirectionValue(){
        Direction[] directions = Direction.values();

        assertEquals(directions[0], Direction.EAST);
        assertEquals(directions[2], Direction.NORTH);
    }

    @Test
    void testDirectionVar(){
        Direction direction = Direction.EAST;
        assertEquals(direction.getAngle(), Direction.EAST.getAngle());
    }

    @Test
    void print(){
        System.out.println(Direction.EAST);
    }


}
