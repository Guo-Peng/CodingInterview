package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ConvertBinarySearchTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 15, 2017</pre>
 */
public class ConvertBinarySearchTreeTest {
    static ConvertBinarySearchTree ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ConvertBinarySearchTree();
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
    public void testConvert() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {10, 6, 4, 8, 14, 12, 16};
        int[] inOrder = {4, 6, 8, 10, 12, 14, 16};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("4 6 8 10 12 14 16", ins.printList(ins.convert(root)));

        preOrder = new int[]{7, 6, 5, 4, 3, 2, 1};
        inOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1 2 3 4 5 6 7", ins.printList(ins.convert(root)));

        preOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        inOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1 2 3 4 5 6 7", ins.printList(ins.convert(root)));

        preOrder = new int[]{1};
        inOrder = new int[]{1};
        root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1", ins.printList(ins.convert(root)));

        assertEquals("", ins.printList(ins.convert(null)));
    }


    @Test
    public void testConvertSubTree() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = ConvertBinarySearchTree.getClass().getMethod("convertSubTree", BinaryTreeNode.class, BinaryTreeNode.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
