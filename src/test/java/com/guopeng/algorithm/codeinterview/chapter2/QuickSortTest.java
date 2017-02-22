package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.Print;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * QuickSort Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 2, 2017</pre>
 */
public class QuickSortTest {
    static QuickSort ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new QuickSort();
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
    public void testQuickSort() throws Exception {
        int[] arr = {6, 5, 3, 4, 8, 1, 9, 2, 7};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ins.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals("quick sort with no replicate value", result, arr);

        arr = new int[]{3, 6, 1, 2, 5, 2, 4};
        result = new int[]{1, 2, 2, 3, 4, 5, 6};

        ins.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals("quick sort with one replicate value", result, arr);

        arr = new int[]{1, 2, 1, 2, 1, 2};
        result = new int[]{1, 1, 1, 2, 2, 2};

        ins.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals("quick sort with replicate value", result, arr);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.quickSort(arr, -1, arr.length - 1);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.quickSort(arr, 0, arr.length);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.quickSort(null, 0, 1);

    }
} 
