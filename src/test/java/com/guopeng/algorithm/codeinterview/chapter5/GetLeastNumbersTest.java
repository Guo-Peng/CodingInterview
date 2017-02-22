package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.chapter2.QuickSort;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * GetLeastNumbers Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 16, 2017</pre>
 */
public class GetLeastNumbersTest {
    static GetLeastNumbers ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new GetLeastNumbers();
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
    public void testGetLeastNumbers() throws Exception {
        QuickSort quickSort = new QuickSort();
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int[] result = ins.getLeastNumbers(arr, 4);
        quickSort.quickSort(result, 0, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);

        result = ins.getLeastNumbers(arr, 8);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, result);

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.getLeastNumbers(null, 1);

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.getLeastNumbers(arr, 100);


    }


} 
