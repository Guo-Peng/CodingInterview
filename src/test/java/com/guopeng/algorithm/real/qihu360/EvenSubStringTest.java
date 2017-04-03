package com.guopeng.algorithm.real.qihu360;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * EvenSubString Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 25, 2017</pre>
 */
public class EvenSubStringTest {
    static EvenSubString ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new EvenSubString();
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
    public void testEvenSubString() throws Exception {
        String str = "abbc";
        assertEquals(1, ins.evenSubString(str));

        str = "abba";
        assertEquals(2, ins.evenSubString(str));

        str = "abbcca";
        assertEquals(4, ins.evenSubString(str));
    }


} 
