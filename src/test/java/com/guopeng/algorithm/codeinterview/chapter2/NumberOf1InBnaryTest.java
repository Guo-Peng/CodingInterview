package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * NumberOf1InBnary Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 3, 2017</pre>
 */
public class NumberOf1InBnaryTest {
    static NumberOf1InBnary ins;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new NumberOf1InBnary();
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
    public void testNumberOf1InBinary() {
        assertEquals("1 in 1", 1, ins.numberOf1InBinary(1));
        assertEquals("1 in 0", 0, ins.numberOf1InBinary(0));
        assertEquals("1 in 0x7FFFFFFF", 31, ins.numberOf1InBinary(0x7FFFFFFF));
        assertEquals("1 in 0x80000000", 1, ins.numberOf1InBinary(0x80000000));
        assertEquals("1 in 0xffffffff", 32, ins.numberOf1InBinary(0xffffffff));
    }


} 
