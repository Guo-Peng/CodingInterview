package com.guopeng.algorithm.codeinterview.chapter8; 

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.ConstructBinaryTree;
import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/** 
* SerializeBinaryTrees Tester. 
* 
* @author guopeng
* @since <pre>三月 10, 2017</pre> 
* @version 1.0 
*/ 
public class SerializeBinaryTreesTest { 
    static SerializeBinaryTrees ins;
    
    @Rule
    public ExpectedException expectedExc = ExpectedException.none();
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new SerializeBinaryTrees();
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
    public void testSerialize() throws Exception {
        ConstructBinaryTree construct = new ConstructBinaryTree();
        int[] preOrder = {8, 6, 5, 7, 10, 9, 11};
        int[] inOrder = {5, 6, 7, 8, 9, 10, 11};
        BinaryTreeNode root = construct.constructBinaryTree(preOrder, inOrder);

        System.out.println(ins.serialize(root));
    } 

    @Test
    public void testDeserialize() throws Exception { 
        //TODO: Test goes here... 
    } 


} 
