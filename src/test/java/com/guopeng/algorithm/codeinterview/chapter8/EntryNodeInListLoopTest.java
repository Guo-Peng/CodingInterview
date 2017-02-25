package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;
import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * EntryNodeInListLoop Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class EntryNodeInListLoopTest {
    static EntryNodeInListLoop ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new EntryNodeInListLoop();
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
    public void testMeetingNode() throws Exception {
        LinkedList list = new LinkedList();
        ListNode node1 = list.new ListNode(1);
        ListNode node2 = list.new ListNode(2);
        ListNode node3 = list.new ListNode(3);
        ListNode node4 = list.new ListNode(4);
        ListNode node5 = list.new ListNode(5);
        ListNode node6 = list.new ListNode(6);

        assertSame(null, ins.meetingNode(node1));

        node1.next = node1;
        assertSame(node1, ins.meetingNode(node1));

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;
        assertSame(node3, ins.meetingNode(node1));
    }


} 
