package io.turntabl.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @Test
    void add() {
    int sum =  Maths.add(1,2);
    assertEquals(3,sum);
    }

    @Test
    void substract() {
        int minus = Maths. substract(0,1);
        assertEquals(-1,minus);
    }

    @Test
    void ZerosubstractedZero() {
        int minus = Maths. substract(0,0);
        assertEquals(0,minus);
    }

}