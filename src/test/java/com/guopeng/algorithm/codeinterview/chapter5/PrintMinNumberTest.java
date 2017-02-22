package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * PrintMinNumber Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 16, 2017</pre>
 */
public class PrintMinNumberTest {
    static PrintMinNumber ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new PrintMinNumber();
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
    public void testPrintMinNumber() throws Exception {
        int[] arr = {3, 32, 321};
        System.out.println(ins.printMinNumber(arr));
    }
    

} 
