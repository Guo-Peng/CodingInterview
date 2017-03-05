package com.guopeng.algorithm.real.ali;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * HeartCurve Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 4, 2017</pre>
 */
public class HeartCurveTest {
    static HeartCurve ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new HeartCurve();
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
    public void testLeartCurve() throws Exception {
        ins.leartCurve(0, 1, 0, 1);
    }


} 
