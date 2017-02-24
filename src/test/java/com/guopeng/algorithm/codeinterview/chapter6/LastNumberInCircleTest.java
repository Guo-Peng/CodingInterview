package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * LastNumberInCircle Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 24, 2017</pre>
 */
public class LastNumberInCircleTest {
    static LastNumberInCircle ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new LastNumberInCircle();
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
    public void testLastNumberInCircle() throws Exception {
        assertEquals(2, ins.lastNumberInCircle(5, 2));
        assertEquals(3, ins.lastNumberInCircle(5, 3));
        assertEquals(4, ins.lastNumberInCircle(6, 7));
        assertEquals(3, ins.lastNumberInCircle(6, 6));
        assertEquals(1027, ins.lastNumberInCircle(4000, 997));
    }


} 
