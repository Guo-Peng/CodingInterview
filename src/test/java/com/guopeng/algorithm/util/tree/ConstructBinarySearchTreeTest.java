package com.guopeng.algorithm.util.tree;

import static org.junit.Assert.*;

import com.guopeng.algorithm.real.xiaomi.RecTree;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ConstructBinarySearchTree Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 12, 2017</pre>
 */
public class ConstructBinarySearchTreeTest {
    static ConstructBinarySearchTree ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ConstructBinarySearchTree();
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
    public void testConstructBinarySearchTree() throws Exception {
        RecTree recTree = new RecTree();
        int[] arr = {5, 3, 1, 6, 9, 2, 0};
        assertEquals("0123569", recTree.inOrder(ins.constructBinarySearchTree(arr)));
    }


} 
