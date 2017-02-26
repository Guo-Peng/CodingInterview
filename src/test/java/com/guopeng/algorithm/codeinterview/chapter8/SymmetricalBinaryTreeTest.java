package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * SymmetricalBinaryTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 26, 2017</pre>
 */
public class SymmetricalBinaryTreeTest {
    static SymmetricalBinaryTree ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new SymmetricalBinaryTree();
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
    public void testSymmetricalBinaryTree() throws Exception {
        BinaryTreeNode node1 = new BinaryTreeNode(8);
        BinaryTreeNode node2 = new BinaryTreeNode(6);
        BinaryTreeNode node3 = new BinaryTreeNode(6);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(7);
        BinaryTreeNode node6 = new BinaryTreeNode(7);
        BinaryTreeNode node7 = new BinaryTreeNode(5);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;

        assertEquals(false, ins.symmetricalBinaryTree(node1));

        node3.right = node7;

        assertEquals(true, ins.symmetricalBinaryTree(node1));

        node7.value = 1;

        assertEquals(false, ins.symmetricalBinaryTree(node1));
    }

} 
