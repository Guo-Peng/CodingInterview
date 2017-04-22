package com.guopeng.algorithm.real.code.Tree;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import com.guopeng.algorithm.real.xiaomi.RecTree;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * RecoverBinarySearchTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 22, 2017</pre>
 */
public class RecoverBinarySearchTreeTest {

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
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
    public void testRecoverTree() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        RecTree recTree = new RecTree();
        RecoverBinarySearchTree ins = new RecoverBinarySearchTree();
        int[] preOrder = {15, 7, 17, 2, 4, 9, 8, 13, 19, 3, 23};
        int[] inOrder = {2, 17, 4, 7, 8, 9, 13, 15, 3, 19, 23};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        ins.recoverTree(root);
        assertEquals("2347891315171923", recTree.inOrder(root));

        preOrder = new int[]{15, 3, 7, 2, 4, 9, 8, 13, 19, 17, 23};
        inOrder = new int[]{2, 7, 4, 3, 8, 9, 13, 15, 17, 19, 23};
        root = construct.constructBinaryTree(preOrder, inOrder);

        ins = new RecoverBinarySearchTree();
        ins.recoverTree(root);
        assertEquals("2347891315171923", recTree.inOrder(root));
    }


} 
