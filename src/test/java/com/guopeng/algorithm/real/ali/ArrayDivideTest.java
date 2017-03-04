package com.guopeng.algorithm.real.ali;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ArrayDivide Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 4, 2017</pre>
 */
public class ArrayDivideTest {
    static ArrayDivide ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ArrayDivide();
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
    public void testArrayDivide() throws Exception {
        int[] arr = {2, 5, 1, 1, 1, 1, 4, 3, 7, 5, 7};

        assertEquals(true, ins.arrayDivide(arr));

        arr = new int[]{0, 0, 0, 0};

        assertEquals(true, ins.arrayDivide(arr));
    }
} 
