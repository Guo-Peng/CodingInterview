package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * AddTwoNumbers Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 24, 2017</pre>
 */
public class AddTwoNumbersTest {
    static AddTwoNumbers ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new AddTwoNumbers();
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
    public void testAddTwoNumbers() throws Exception {
        assertEquals(15, ins.addTwoNumbers(5, 10));
        assertEquals(-15, ins.addTwoNumbers(-5, -10));
        assertEquals(10, ins.addTwoNumbers(0, 10));
    }


} 
