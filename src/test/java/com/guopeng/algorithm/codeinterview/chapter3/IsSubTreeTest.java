package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * IsSubTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 10, 2017</pre>
 */
public class IsSubTreeTest {
    static IsSubTree ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new IsSubTree();
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
    public void testIsSubTree() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {6, 8, 9, 2, 4, 7, 1};
        int[] inOrder = {9, 8, 4, 2, 7, 6, 1};
        BinaryTreeNode root1 = construct.constructBinaryTree(preOrder, inOrder);

        preOrder = new int[]{8, 9, 2};
        inOrder = new int[]{9, 8, 2};
        BinaryTreeNode root2 = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(true, ins.isSubTree(root1, root2));

        preOrder = new int[]{8, 9, 3};
        inOrder = new int[]{9, 8, 3};
        root2 = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals(false, ins.isSubTree(root1, root2));

        assertEquals("root1 is null", false, ins.isSubTree(null, root2));

        assertEquals("root2 is null", false, ins.isSubTree(root1, null));

        preOrder = new int[]{1, 2, 3, 4, 5, 6, 7};
        inOrder = new int[]{7, 6, 5, 4, 3, 2, 1};
        root1 = construct.constructBinaryTree(preOrder, inOrder);
        preOrder = new int[]{2, 3, 4,};
        inOrder = new int[]{4, 3, 2};
        root2 = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals("tree with only left node", true, ins.isSubTree(root1, root2));

        preOrder = new int[]{1, 2, 3, 4};
        inOrder = new int[]{1, 2, 3, 4};
        root1 = construct.constructBinaryTree(preOrder, inOrder);
        preOrder = new int[]{2, 3, 4};
        inOrder = new int[]{2, 3, 4};
        root2 = construct.constructBinaryTree(preOrder, inOrder);
        assertEquals("tree with only left node", true, ins.isSubTree(root1, root2));


    }


    @Test
    public void testIsSame() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = IsSubTree.getClass().getMethod("isSame", BinaryTreeNode.class, BinaryTreeNode.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
