package com.guopeng.algorithm.util.sort;

import static org.junit.Assert.*;

import com.guopeng.algorithm.util.sort.HeapSort;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * HeapSort Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 6, 2017</pre>
 */
public class HeapSortTest {
    static HeapSort ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new HeapSort();
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
    public void testHeapSort() throws Exception {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};

        ins.heapSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, arr);

        arr = new int[]{5, 7, 4, 6, 9, 2, 1};

        ins.heapSort(arr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7, 9}, arr);
    }
} 
