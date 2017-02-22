package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * TreeDepth Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 18, 2017</pre>
 */
public class TreeDepthTest {
    static TreeDepth ins;
    ConstructBinaryTree construct = new ConstructBinaryTree();

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new TreeDepth();
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
    public void testTreeDepth() throws Exception {
        int[] preOrder = {1, 2, 4, 5, 7, 3, 6};
        int[] inOrder = {4, 2, 7, 5, 1, 3, 6};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(4, ins.treeDepth(root));

        preOrder = new int[]{1};
        inOrder = new int[]{1};
        root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(1, ins.treeDepth(root));

        assertEquals(0, ins.treeDepth(null));
    }

    @Test
    public void testIsBalance() throws Exception {
        int[] preOrder = {1, 2, 4, 5, 7, 3, 6};
        int[] inOrder = {4, 2, 7, 5, 1, 3, 6};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(true, ins.isBalance(root));

        preOrder = new int[]{1, 2, 4, 6, 5, 3};
        inOrder = new int[]{6, 4, 2, 5, 1, 3};
        root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(false, ins.isBalance(root));

        preOrder = new int[]{1, 2, 3, 4, 5, 6};
        inOrder = new int[]{6, 5, 4, 3, 2, 1};
        root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(false, ins.isBalance(root));

        preOrder = new int[]{1, 2, 3, 4, 5, 6};
        inOrder = new int[]{1, 2, 3, 4, 5, 6};
        root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(false, ins.isBalance(root));
    }

} 
