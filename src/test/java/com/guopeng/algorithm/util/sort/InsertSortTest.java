package com.guopeng.algorithm.util.sort;

import static org.junit.Assert.*;

import com.guopeng.algorithm.util.sort.InsertSort;
import org.junit.*;
import org.junit.rules.ExpectedException;

/** 
* InsertSort Tester. 
* 
* @author guopeng
* @since <pre>三月 4, 2017</pre> 
* @version 1.0 
*/ 
public class InsertSortTest { 
    static InsertSort ins;
    
    @Rule
    public ExpectedException expectedExc = ExpectedException.none();
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new InsertSort();
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
    public void testInsertSort() throws Exception {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};

        ins.insertSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, arr);

        arr = new int[]{5, 7, 4, 6, 9, 2, 1};

        ins.insertSort(arr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7, 9}, arr);
    } 


} 
