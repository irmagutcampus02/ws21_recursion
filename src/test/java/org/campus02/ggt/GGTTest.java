package org.campus02.ggt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GGTTest {

    private GGT ggt;

    @BeforeEach
    void setUp() {
        ggt = new GGT();
    }

    @Test
    void ggtIterative() {
        assertEquals(2, ggt.ggtIterative(18, 8));
        assertEquals(6, ggt.ggtIterative(114, 66));
    }

    @Test
    void ggtRecursive() {
        assertEquals(2, ggt.ggtRecursive(18, 8));
        assertEquals(6, ggt.ggtRecursive(114, 66));
    }
}
