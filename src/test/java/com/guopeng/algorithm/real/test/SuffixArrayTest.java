package com.guopeng.algorithm.real.test;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * SuffixArray Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 3, 2017</pre>
 */
public class SuffixArrayTest {
    static SuffixArray ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new SuffixArray();
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
    public void testGetRank() throws Exception {
        //TODO: Test goes here... 
    }

    @Test
    public void testMain() throws Exception {
//        String str = "aabaaaab";
//        ins.getRank(str);
    }


    @Test
    public void testToIntArray() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = SuffixArray.getClass().getMethod("toIntArray", String.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
