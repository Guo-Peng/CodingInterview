package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;
import com.guopeng.algorithm.codeinterview.utils.LinkedList;

/**
 * FindKthToTail Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 10, 2017</pre>
 */
public class FindKthToTailTest {
    static FindKthToTail ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindKthToTail();
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
    public void testFindKthToTail() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6};
        LinkedList list = new LinkedList();
        list.constructList(arr);

        assertEquals("node in the middle of the list", 4, ins.FindKthToTail(list, 3).value);
        assertEquals("node is the tail of the list", 6, ins.FindKthToTail(list, 1).value);
        assertEquals("node is the head of the list", 1, ins.FindKthToTail(list, 6).value);
        
        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.FindKthToTail(null, 6);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.FindKthToTail(list, 0);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("list is not long enough");
        ins.FindKthToTail(list, 10);

    }


} 
