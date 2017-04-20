package com.guopeng.algorithm.real.code.Tree;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FlattenBinaryTreeToLinkedList Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 21, 2017</pre>
 */
public class FlattenBinaryTreeToLinkedListTest {
    static FlattenBinaryTreeToLinkedList ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FlattenBinaryTreeToLinkedList();
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
    public void testFlatten() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {1, 2, 3, 4, 5, 6};
        int[] inOrder = {3, 2, 4, 1, 5, 6};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        ins.flatten(root);
        assertEquals("123456", ins.print(root));

    }

    @Test
    public void testConvert() throws Exception {
        //TODO: Test goes here... 
    }


} 
