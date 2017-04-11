package com.guopeng.algorithm.util.sort;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.Print;
import com.guopeng.algorithm.util.sort.CountingSort;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * CountingSort Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 3, 2017</pre>
 */
public class CountingSortTest {
    static CountingSort ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new CountingSort();
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
    public void testCountingSort() throws Exception {
        int[] arr = {2, 2, 4, 5, 7, 3, 8, 9, 3, 5, 6, 8, 3, 1, 5, 7, 8, 3, 4, 5, 6};
        Print.arrPrint(ins.countingSort(arr, 10));

        arr = new int[]{1, 3, 2, 3, 2, 1, 0};
        assertArrayEquals(new int[]{0, 1, 1, 2, 2, 3, 3}, ins.countingSort(arr, 4));
    }
} 
