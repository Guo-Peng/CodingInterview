package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.ComplexListNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * CopyComplexList Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 14, 2017</pre>
 */
public class CopyComplexListTest {
    static CopyComplexList ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new CopyComplexList();
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
    public void testCopyComplexList() throws Exception {
        ComplexListNode node1 = new ComplexListNode(1);
        ComplexListNode node2 = new ComplexListNode(2);
        ComplexListNode node3 = new ComplexListNode(3);
        ComplexListNode node4 = new ComplexListNode(4);
        ComplexListNode node5 = new ComplexListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.slibling = node3;
        node2.slibling = node5;
        node4.slibling = node2;
        assertEquals(ComplexListNode.print(node1), ComplexListNode.print(ins.copyComplexList(node1)));

        node1.slibling = node1;
        assertEquals(ComplexListNode.print(node1), ComplexListNode.print(ins.copyComplexList(node1)));

        node1 = new ComplexListNode(1);
        node2 = new ComplexListNode(2);
        node1.next = node2;
        node1.slibling = node2;
        node2.slibling = node1;
        assertEquals(ComplexListNode.print(node1), ComplexListNode.print(ins.copyComplexList(node1)));

        node1 = new ComplexListNode(1);
        assertEquals(ComplexListNode.print(node1), ComplexListNode.print(ins.copyComplexList(node1)));
    }

} 
