
package com.example.maven_prag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTest {

    EquilateralTriangle obj = new EquilateralTriangle();

    @Test
    void testEquilateral() {
        assertTrue(obj.isEquilateral(5, 5, 5));
    }

    @Test
    void testNotEquilateral() {
        assertFalse(obj.isEquilateral(5, 5, 6));
    }

    @Test
    void testDifferentSides() {
        assertFalse(obj.isEquilateral(3, 4, 5));
    }

    @Test
    void testZeroSide() {
        assertFalse(obj.isEquilateral(0, 5, 5));
    }

    @Test
    void testNegativeSide() {
        assertFalse(obj.isEquilateral(-5, 5, 5));
    }
}
