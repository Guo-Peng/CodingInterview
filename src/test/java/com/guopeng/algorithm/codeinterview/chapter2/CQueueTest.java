package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * CQueue Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 2, 2017</pre>
 */
public class CQueueTest {
    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
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
    public void testAppendTail() {
        //TODO: Test goes here... 
    }

    @Test
    public void testDeleteHead() throws Exception {
        CQueue<Integer> ins = new CQueue<>();

        ins.appendTail(1);
        assertEquals("insert and delete in a empty queue", 1, ins.deleteHead().intValue());

        ins.appendTail(1);
        ins.appendTail(2);
        ins.appendTail(3);
        ins.appendTail(4);
        ins.appendTail(5);
        assertEquals("insert and delete in a non-empty queue", 1, ins.deleteHead().intValue());
        assertEquals("insert and delete in a non-empty queue", 2, ins.deleteHead().intValue());

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("queue is empty");
        while (true) ins.deleteHead();
    }


} 
