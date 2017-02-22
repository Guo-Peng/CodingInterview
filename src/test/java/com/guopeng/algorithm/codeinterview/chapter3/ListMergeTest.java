package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ListMerge Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 10, 2017</pre>
 */
public class ListMergeTest {
    static ListMerge ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ListMerge();
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
    public void testMerge() throws Exception {
        LinkedList list1 = new LinkedList(new int[]{1, 3, 5, 7, 9});
        LinkedList list2 = new LinkedList(new int[]{2, 4, 6, 8, 10});
        LinkedList list = new LinkedList();

        list.head = ins.merge(list1.head, list2.head);
        assertEquals("merge two list", "12345678910", list.printList());

        list1.constructList(new int[]{1, 2, 2, 2, 3, 4, 5});
        list2.constructList(new int[]{2, 2, 2, 3, 5, 7, 8});

        list.head = ins.merge(list1.head, list2.head);
        assertEquals("merge two list", "12222223345578", list.printList());

        list1.constructList(new int[]{1});
        list2.constructList(new int[]{2});
        list.head = ins.merge(list1.head, list2.head);
        assertEquals("merge two list", "12", list.printList());

        list2.constructList(new int[]{2, 2, 2, 3, 5, 7, 8});
        list.head = ins.merge(null, list2.head);
        assertEquals("merge one list", "2223578", list.printList());

        list.head = ins.merge(null, null);
        assertEquals("merge null list", "", list.printList());

    }


} 
