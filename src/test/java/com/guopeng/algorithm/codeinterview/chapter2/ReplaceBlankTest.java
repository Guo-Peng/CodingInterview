package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ReplaceBlank Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 1, 2017</pre>
 */
public class ReplaceBlankTest {
    static ReplaceBlank ins;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ReplaceBlank();
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
    public void testReplaceBlank() {
        char[] str = " hello,world".toCharArray();
        assertArrayEquals("blank is in the front of string", "%20hello,world".toCharArray(), ins.replaceBlank(str));

        str = "hello,world ".toCharArray();
        assertArrayEquals("blank is in the behind of string", "hello,world%20".toCharArray(), ins.replaceBlank(str));

        str = "hello world".toCharArray();
        assertArrayEquals("blank is in the middle of string", "hello%20world".toCharArray(), ins.replaceBlank(str));

        str = "hello   world".toCharArray();
        assertArrayEquals("multi_blank is in the middle of string", "hello%20%20%20world".toCharArray(), ins.replaceBlank(str));

        str = "hello,world".toCharArray();
        assertArrayEquals("no blank is in the string", "hello,world".toCharArray(), ins.replaceBlank(str));

        str = "".toCharArray();
        assertArrayEquals("string is empty", "".toCharArray(), ins.replaceBlank(str));

        str = " ".toCharArray();
        assertArrayEquals("string is blank", "%20".toCharArray(), ins.replaceBlank(str));

        str = "   ".toCharArray();
        assertArrayEquals("string is multi_blank", "%20%20%20".toCharArray(), ins.replaceBlank(str));

        str = null;
        assertArrayEquals("string is null", null, ins.replaceBlank(str));
    }


} 
