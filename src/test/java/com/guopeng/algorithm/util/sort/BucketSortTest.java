package com.guopeng.algorithm.util.sort;

import static org.junit.Assert.*;

import com.guopeng.algorithm.util.sort.BucketSort;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * BucketSort Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 3, 2017</pre>
 */
public class BucketSortTest {
    static BucketSort ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new BucketSort();
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
    public void testBucketSort() throws Exception {
        int[] arr = {1, 3, 2, 3, 2, 1, 0, 10};
        assertArrayEquals(new int[]{0, 1, 1, 2, 2, 3, 3, 10}, ins.bucketSort(arr, 4));
    }


} 
