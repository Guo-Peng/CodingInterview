package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;
import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FindFirstCommonNode Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 17, 2017</pre>
 */
public class FindFirstCommonNodeTest {
    static FindFirstCommonNode ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindFirstCommonNode();
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
    public void testFindFirstCommonNode() throws Exception {
        LinkedList list = new LinkedList();
        ListNode node1 = list.new ListNode(1);
        ListNode node2 = list.new ListNode(2);
        ListNode node3 = list.new ListNode(3);
        ListNode node4 = list.new ListNode(4);
        ListNode node5 = list.new ListNode(5);
        ListNode node6 = list.new ListNode(6);
        ListNode node7 = list.new ListNode(7);

        node1.next = node2;
        node2.next = node3;

        assertEquals(1, ins.findFirstCommonNode(node1, node1).value);

        node5.next = node3;

        assertEquals(3, ins.findFirstCommonNode(node1, node5).value);

        node3.next = node6;

        assertEquals(3, ins.findFirstCommonNode(node1, node5).value);

        node4.next = node7;

        assertNull(ins.findFirstCommonNode(node1, node4));
        assertNull(ins.findFirstCommonNode(node5, node4));

        assertNull(ins.findFirstCommonNode(node1, null));
    }


    @Test
    public void testListLength() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = FindFirstCommonNode.getClass().getMethod("listLength", ListNode.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

    @Test
    public void testFindNthNode() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = FindFirstCommonNode.getClass().getMethod("findNthNode", ListNode.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
