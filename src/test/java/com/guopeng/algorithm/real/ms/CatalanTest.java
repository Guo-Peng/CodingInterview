package com.guopeng.algorithm.real.ms;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * Catalan Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 10, 2017</pre>
 */
public class CatalanTest {
    static Catalan ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new Catalan();
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
    public void testCatalan() throws Exception {
        assertEquals(1, ins.catalan(0));
        assertEquals(1, ins.catalan(1));
        assertEquals(2, ins.catalan(2));
        assertEquals(5, ins.catalan(3));
        assertEquals(14, ins.catalan(4));
        assertEquals(42, ins.catalan(5));
        assertEquals(132, ins.catalan(6));
        assertEquals(429, ins.catalan(7));
        assertEquals(1430, ins.catalan(8));
        assertEquals(4862, ins.catalan(9));
        assertEquals(16796, ins.catalan(10));
    }


} 
