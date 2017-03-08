package com.guopeng.algorithm.util;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * KMP Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 9, 2017</pre>
 */
public class KMPTest {
    static KMP ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new KMP();
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
    public void testSearch() throws Exception {
        assertEquals(12, ins.search("AACAA", "AABRAACADABRAACAADABRA"));
    }


    @Test
    public void testPatDfa() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = KMP.getClass().getMethod("patDfa", String.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
