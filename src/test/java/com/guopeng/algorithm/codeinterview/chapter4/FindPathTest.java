package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FindPath Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 14, 2017</pre>
 */
public class FindPathTest {
    static FindPath ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindPath();
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
    public void testFindPath() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {10, 5, 4, 7, 12};
        int[] inOrder = {4, 5, 7, 10, 12};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        ins.findPath(root, 22);
        ins.findPathII(root, 22);
        System.out.println();

        ins.findPath(root, 19);
        ins.findPathII(root, 19);
        System.out.println();

        ins.findPath(root, 12);
        ins.findPathII(root, 12);
        System.out.println();

        ins.findPath(null, 12);
        System.out.println();
    }


    @Test
    public void testFindSubPath() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = FindPath.getClass().getMethod("findSubPath", BinaryTreeNode.class, int.class, String.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
