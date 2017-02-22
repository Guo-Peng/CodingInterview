package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.Print;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * StringPermutation Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 15, 2017</pre>
 */
public class StringPermutationTest {
    static StringPermutation ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new StringPermutation();
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
    public void testStringPermutation() throws Exception {
        char[] str = {'a', 'b', 'c'};
        System.out.println(String.format("alphaBeta: %s", String.valueOf(str)));
        ins.stringPermutation(str);

        System.out.println();

        str = new char[]{'a'};
        System.out.println(String.format("alphaBeta: %s", String.valueOf(str)));
        ins.stringPermutation(str);

        System.out.println();

        ins.stringPermutation(null);
    }


    @Test
    public void testBitPermutation() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = StringPermutation.getClass().getMethod("bitPermutation", char[].class, char[].class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
