package com.guopeng.algorithm.real.code.Tree;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * SerializeAndDeserializeBinaryTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 23, 2017</pre>
 */
public class SerializeAndDeserializeBinaryTreeTest {
    static SerializeAndDeserializeBinaryTree ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new SerializeAndDeserializeBinaryTree();
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
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        assertEquals("1,2,3,null,null,4,5", ins.serialize(t1));
    }

    @Test
    public void testDeserialize() throws Exception {
        assertEquals("1,2,3,null,null,4,5", ins.serialize(ins.deserialize("1,2,3,null,null,4,5")));
        assertEquals("null", ins.serialize(ins.deserialize("null")));
        assertEquals("1,2", ins.serialize(ins.deserialize("1,2")));
    }


} 
