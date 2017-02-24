package com.guopeng.algorithm.codeinterview.chapter7;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * GetLastCommonParent Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class GetLastCommonParentTest {
    static GetLastCommonParent ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new GetLastCommonParent();
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
    public void testGetLastCommonParent1() throws Exception {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        assertSame(node1, ins.getLastCommonParent(node1, node4, node6));
    }

    @Test
    public void testGetLastCommonParent2() throws Exception {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        node4.left = node5;
        node5.left = node6;
        node6.left = node7;

        assertSame(node5, ins.getLastCommonParent(node1, node5, node7));
    }

    @Test
    public void testGetLastCommonParent3() throws Exception {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        node4.left = node5;
        node5.left = node6;

        assertSame(null, ins.getLastCommonParent(node1, node6, node7));
    }


} 
