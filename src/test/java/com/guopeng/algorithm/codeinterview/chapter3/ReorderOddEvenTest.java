package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.Print;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ReorderOddEven Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 10, 2017</pre>
 */
public class ReorderOddEvenTest {
    static ReorderOddEven ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ReorderOddEven();
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
    public void testReorderOddEven() throws Exception {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        ins.reorderOddEven(arr, new IsOdd());
        Print.arrPrint(arr);

        arr = new int[]{2};
        ins.reorderOddEven(arr, new IsOdd());
        Print.arrPrint(arr);

        arr = null;
        ins.reorderOddEven(arr, new IsOdd());
    }


    @Test
    public void testChangeElement() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = ReorderOddEven.getClass().getMethod("changeElement", int[].class, int.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
