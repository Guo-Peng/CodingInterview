package com.guopeng.algorithm.codeinterview.utils;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * LinkedList Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 9, 2017</pre>
 */
public class LinkedListTest {
    static LinkedList ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new LinkedList();
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
    public void testAddToTail() throws Exception {
        //TODO: Test goes here... 
    }

    @Test
    public void testPrintList() throws Exception {
        assertEquals("empty list", "", ins.printList());

        int[] arr = {1, 2, 3, 4, 5, 6};
        ins.constructList(arr);

        assertEquals("non-empty list", "123456", ins.printList());
    }

    @Test
    public void testGetNode() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ins.constructList(arr);

        assertEquals("get first node", 1, ins.getNode(1).value);
        assertEquals("get middle node", 5, ins.getNode(5).value);
        assertEquals("get last node", 6, ins.getNode(6).value);
        assertNull("get not exist node", ins.getNode(7));
    }


} 
