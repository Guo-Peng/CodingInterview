package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * PrintTreeInZigzag Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 27, 2017</pre>
 */
public class PrintTreeInZigzagTest {
    static PrintTreeInZigzag ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new PrintTreeInZigzag();
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
    public void testPrintTreeInZigzag() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
        int[] inOrder = {8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("132456715141312111098", ins.printTreeInZigzag(root));
    }


} 
