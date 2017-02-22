package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * ConstructBinaryTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 1, 2017</pre>
 */
public class ConstructBinaryTreeTest {
    static ConstructBinaryTree ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ConstructBinaryTree();
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
    public void testConstructBinaryTree() throws Exception {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = ins.constructBinaryTree(preOrder, inOrder);
        assertEquals("non-full binary tree", "74258631", BinaryTreeNode.postOrder(root));

        preOrder = new int[]{1, 2, 4, 5, 3, 6, 7};
        inOrder = new int[]{4, 2, 5, 1, 6, 3, 7};
        root = ins.constructBinaryTree(preOrder, inOrder);
        assertEquals("full binary tree", "4526731", BinaryTreeNode.postOrder(root));

        preOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        inOrder = new int[]{7, 6, 5, 4, 3, 2, 1};
        root = ins.constructBinaryTree(preOrder, inOrder);
        assertEquals("binary tree with only left node", "7654321", BinaryTreeNode.postOrder(root));

        preOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        inOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        root = ins.constructBinaryTree(preOrder, inOrder);
        assertEquals("binary tree with only right node", "7654321", BinaryTreeNode.postOrder(root));

        preOrder = new int[]{1};
        inOrder = new int[]{1};
        root = ins.constructBinaryTree(preOrder, inOrder);
        assertEquals("binary tree with only one node", "1", BinaryTreeNode.postOrder(root));

        assertNull("binary tree with no node", ins.constructBinaryTree(null, null));

        preOrder = new int[]{1, 2, 4, 5, 3, 6, 7};
        inOrder = new int[]{4, 2, 6, 1, 5, 3, 7};

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.constructBinaryTree(preOrder, inOrder);
    }


} 
