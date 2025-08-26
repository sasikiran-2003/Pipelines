package com.example.maven_pipelines;

import com.example.maven_pipelines.OperationsImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OperationsTest {

    @Test
    public void testAdd() {
        assertEquals(64, Operations.add(60, 4));
    }

    @Test
    public void testSub() {
        assertEquals(20, Operations.sub(50, 30));
    }

    @Test
    public void testMul() {
        assertEquals(100, Operations.mul(10, 10));
    }

    @Test
    public void testDiv() {
        assertEquals(25, Operations.div(100, 4));
    }
}


