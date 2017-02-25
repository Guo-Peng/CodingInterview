package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ArrayConstruction Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class ArrayConstructionTest {
    static ArrayConstruction ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ArrayConstruction();
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
    public void testArrayConstruction() throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {120, 60, 40, 30, 24};
        assertArrayEquals(result, ins.arrayConstruction(arr));

        arr = new int[]{1, 2, 0, 4, 5};
        result = new int[]{0, 0, 40, 0, 0};
        assertArrayEquals(result, ins.arrayConstruction(arr));

        arr = new int[]{1, 2, 0, 4, 0};
        result = new int[]{0, 0, 0, 0, 0};
        assertArrayEquals(result, ins.arrayConstruction(arr));

        arr = new int[]{1, -2, 3, -4, 5};
        result = new int[]{120, -60, 40, -30, 24};
        assertArrayEquals(result, ins.arrayConstruction(arr));

        arr = new int[]{1, -2};
        result = new int[]{-2, 1};
        assertArrayEquals(result, ins.arrayConstruction(arr));
    }


} 
