package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.Print;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * MinInStack Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 13, 2017</pre>
 */
public class MinInStackTest {
    static MinInStack ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new MinInStack<Integer>();
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
    public void testPush() throws Exception {
        //TODO: Test goes here... 
    }

    @Test
    public void testPop() throws Exception {
        //TODO: Test goes here... 
    }

    @Test
    public void testMin() throws Exception {
        ins.push(2);
        ins.push(1);
        ins.push(3);
        ins.push(4);

        ins.push(5);
        assertEquals(1, ins.min());

        ins.pop();
        assertEquals(1, ins.min());

        ins.push(0);
        assertEquals(0, ins.min());

        ins.pop();
        assertEquals(1, ins.min());
    }


} 
