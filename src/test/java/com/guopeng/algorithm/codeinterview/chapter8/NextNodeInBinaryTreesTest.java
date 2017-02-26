package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * NextNodeInBinaryTrees Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 26, 2017</pre>
 */
public class NextNodeInBinaryTreesTest {
    static NextNodeInBinaryTrees ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new NextNodeInBinaryTrees();
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
    public void testGetNext() throws Exception {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        BinaryTreeNode node8 = new BinaryTreeNode(8);
        BinaryTreeNode node9 = new BinaryTreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.parent = node1;
        node3.parent = node1;

        node2.left = node4;
        node2.right = node5;
        node5.parent = node2;
        node4.parent = node2;

        node3.left = node6;
        node3.right = node7;
        node6.parent = node3;
        node7.parent = node3;

        node5.left = node8;
        node5.right = node9;
        node8.parent = node5;
        node9.parent = node5;

        assertSame(node8, ins.getNext(node2));
        assertSame(node1, ins.getNext(node9));
        assertSame(node2, ins.getNext(node4));
        assertSame(null, ins.getNext(node7));
    }


} 
