package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ListReversePrint Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 1, 2017</pre>
 */
public class ListReversePrintTest {
    static ListReversePrint ins;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ListReversePrint();
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
    public void testListReversePrint() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        ListNode head = ListNode.constructList(arr);
        assertEquals("reverse multi_node list", "654321", ins.listReversePrint(head));

        head = new ListNode(5);
        assertEquals("reverse one node list", "5", ins.listReversePrint(head));

        head = null;
        assertEquals("reverse no node list", "", ins.listReversePrint(head));
    }


} 
