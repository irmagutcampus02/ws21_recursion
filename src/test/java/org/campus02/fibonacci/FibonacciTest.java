package org.campus02.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fib() {
        final Fibonacci fibonacci = new Fibonacci();
        assertEquals(1, fibonacci.fib(1));
        assertEquals(1, fibonacci.fib(2));
        assertEquals(5, fibonacci.fib(5));
        assertEquals(55, fibonacci.fib(10));
        assertEquals(610, fibonacci.fib(15));
    }
}
