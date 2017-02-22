package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * DeleteNode Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 9, 2017</pre>
 */
public class DeleteNodeTest {
    static DeleteNode ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new DeleteNode();
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
    public void testDeleteNode() throws Exception {
        LinkedList list = new LinkedList();

        list.addToTail(1);

        ins.deleteNode(list, list.getNode(1));
        assertEquals("delete one node list", "", list.printList());

        int[] arr = {1, 2, 3, 4, 5, 6};
        list.constructList(arr);

        ins.deleteNode(list, list.getNode(5));
        assertEquals("delete node", "12346", list.printList());

        ins.deleteNode(list, list.getNode(6));
        assertEquals("delete last node", "1234", list.printList());

        ins.deleteNode(list, list.getNode(1));
        assertEquals("delete first node", "234", list.printList());

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.deleteNode(null, null);
    }


} 
