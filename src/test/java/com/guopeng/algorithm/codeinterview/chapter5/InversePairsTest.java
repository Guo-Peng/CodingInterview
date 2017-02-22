package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.Print;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * InversePairs Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 17, 2017</pre>
 */
public class InversePairsTest {
    static InversePairs ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new InversePairs();
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
    public void testInversePairs() throws Exception {
        int[] arr = {7, 5, 6, 4};
        assertEquals(5, ins.inversePairs(arr));
        Print.arrPrint(arr);

        arr = new int[]{1, 2, 3, 4};
        assertEquals(0, ins.inversePairs(arr));
        Print.arrPrint(arr);

        arr = new int[]{4, 3, 2, 1};
        assertEquals(6, ins.inversePairs(arr));
        Print.arrPrint(arr);

        arr = new int[]{4, 3, 3, 1};
        assertEquals(5, ins.inversePairs(arr));
        Print.arrPrint(arr);

        arr = new int[]{4, 3};
        assertEquals(1, ins.inversePairs(arr));
        Print.arrPrint(arr);

        arr = new int[]{4};
        assertEquals(0, ins.inversePairs(arr));
        Print.arrPrint(arr);

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.inversePairs(null);
    }


    @Test
    public void testSort() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = InversePairs.getClass().getMethod("sort", int[].class, int.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

    @Test
    public void testMerge() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = InversePairs.getClass().getMethod("merge", int[].class, int.class, int.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
