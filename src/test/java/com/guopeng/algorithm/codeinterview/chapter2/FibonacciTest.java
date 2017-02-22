package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Fibonacci Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 3, 2017</pre>
 */
public class FibonacciTest {
    static Fibonacci ins;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new Fibonacci();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFibonacci() {
        assertEquals(1, ins.fibonacci(1));
        assertEquals(8, ins.fibonacci(6));
    }


} 
