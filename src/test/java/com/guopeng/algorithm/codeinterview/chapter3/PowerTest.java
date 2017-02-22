package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import org.junit.*;

import org.junit.rules.ExpectedException;

/**
 * Power Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 7, 2017</pre>
 */
public class PowerTest {
    static Power ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new Power();
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
    public void testPower() throws Exception {
        assertEquals("2 power of 2 is 4", 4, ins.power(2, 2), 0.001);
        assertEquals("2 power of -2 is 1/4", 0.25, ins.power(2, -2), 0.001);
        assertEquals("-2 power of 2 is 4", 4, ins.power(-2, 2), 0.001);
        assertEquals("-2 power of 3 is -8", -8, ins.power(-2, 3), 0.001);
        assertEquals("-2 power of -2 is -1/4", 0.25, ins.power(-2, -2), 0.001);

        assertEquals("0 power of 0 is 1", 1, ins.power(0, 0), 0.001);
        assertEquals("0 power of positive num is 0", 0, ins.power(0, 2), 0.001);
        assertEquals("num power of 0 is 1", 1, ins.power(2, 0), 0.001);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("can not divided by 0");
        ins.power(0, -2);

    }


} 
