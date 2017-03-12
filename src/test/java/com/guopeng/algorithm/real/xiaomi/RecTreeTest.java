package com.guopeng.algorithm.real.xiaomi;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * RecTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 12, 2017</pre>
 */
public class RecTreeTest {
    static RecTree ins;
    ConstructBinaryTree construct = new ConstructBinaryTree();

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new RecTree();
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
    public void testPreOrder() throws Exception {
        int[] preOrder = {1, 2, 4, 5, 7, 3, 6};
        int[] inOrder = {4, 2, 7, 5, 1, 3, 6};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals("1245736", ins.preOrder(root));
    }

    @Test
    public void testInOrder() throws Exception {
        //TODO: Test goes here... 
    }

    @Test
    public void testPostOrder() throws Exception {
        //TODO: Test goes here... 
    }


} 
