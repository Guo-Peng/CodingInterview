package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * PrintFromTopToBottom Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 14, 2017</pre>
 */
public class PrintFromTopToBottomTest {
    static PrintFromTopToBottom ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new PrintFromTopToBottom();
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
    public void testPrintFromTopToBottom() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {1, 2, 4, 5, 7, 3, 6};
        int[] inOrder = {4, 2, 7, 5, 1, 3, 6};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1234567", ins.printFromTopToBottom(root));

        preOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        inOrder = new int[]{7, 6, 5, 4, 3, 2, 1};
        root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1234567", ins.printFromTopToBottom(root));

        preOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        inOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1234567", ins.printFromTopToBottom(root));

        preOrder = new int[]{1};
        inOrder = new int[]{1};
        root = construct.constructBinaryTree(preOrder, inOrder);

        assertEquals("1", ins.printFromTopToBottom(root));

        assertEquals("", ins.printFromTopToBottom(null));

    }


    @Test
    public void testOfferSubNode() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = PrintFromTopToBottom.getClass().getMethod("offerSubNode", Queue<BinaryTreeNode>.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
