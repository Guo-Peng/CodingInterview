package com.guopeng.algorithm.real.ali;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * IsOneEditDistance Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 17, 2017</pre>
 */
public class IsOneEditDistanceTest {
    static IsOneEditDistance ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new IsOneEditDistance();
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
    public void testIsOneEditDistance() throws Exception {
        assertEquals(true, ins.isOneEditDistance("abc", "ab"));
        assertEquals(true, ins.isOneEditDistance("abc", "acc"));
        assertEquals(true, ins.isOneEditDistance("abc", "abcd"));
        assertEquals(false, ins.isOneEditDistance("ab", "abcd"));
    }


} 
