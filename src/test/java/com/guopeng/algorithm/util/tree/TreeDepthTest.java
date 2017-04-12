package com.guopeng.algorithm.util.tree;

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
 * @since <pre>四月 12, 2017</pre>
 */
public class TreeDepthTest {
    static TreeDepth ins;
    static ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();

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
    public void testRecTreeDepth() throws Exception {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = constructBinaryTree.constructBinaryTree(preOrder, inOrder);

        assertEquals(4, ins.cycTreeDepth(root));
    }

    @Test
    public void testTreeDepth() throws Exception {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = constructBinaryTree.constructBinaryTree(preOrder, inOrder);

        assertEquals(4, ins.treeDepth(root));
    }


} 
