package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ReverseList Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 10, 2017</pre>
 */
public class ReverseListTest {
    static ReverseList ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ReverseList();
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
    public void testReverseList() throws Exception {
        LinkedList list = new LinkedList();
        list.addToTail(1);

        assertSame("reverse one node list", list.head, ins.reverseList(list.head));

        int[] arr = {1, 2, 3, 4, 5, 6};
        list.constructList(arr);

        list.head = ins.reverseList(list.head);
        assertEquals("reverse normal list", "654321", list.printList());

        assertNull("reverse null", ins.reverseList(null));
    }


    @Test
    public void testReverseNode() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = ReverseList.getClass().getMethod("reverseNode", ListNode.class, ListNode.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
