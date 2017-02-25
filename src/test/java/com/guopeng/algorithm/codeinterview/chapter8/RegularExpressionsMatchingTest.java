package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * RegularExpressionsMatching Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class RegularExpressionsMatchingTest {
    static RegularExpressionsMatching ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new RegularExpressionsMatching();
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
    public void testMatch() throws Exception {
        String str = "";

        String reg = "";
        assertEquals(true, ins.match(reg, str));

        reg = ".*";
        assertEquals(true, ins.match(reg, str));

        reg = ".";
        assertEquals(false, ins.match(reg, str));

        reg = "c*";
        assertEquals(true, ins.match(reg, str));

        str = "a";

        reg = "";
        assertEquals(false, ins.match(reg, str));

        reg = ".*";
        assertEquals(true, ins.match(reg, str));

        reg = "a.";
        assertEquals(false, ins.match(reg, str));

        reg = "a*";
        assertEquals(true, ins.match(reg, str));

        reg = ".";
        assertEquals(true, ins.match(reg, str));

        reg = "ab*";
        assertEquals(true, ins.match(reg, str));

        reg = "ab*a";
        assertEquals(false, ins.match(reg, str));

        str = "aa";

        reg = "aa";
        assertEquals(true, ins.match(reg, str));

        reg = "a*";
        assertEquals(true, ins.match(reg, str));

        reg = ".*";
        assertEquals(true, ins.match(reg, str));

        reg = ".";
        assertEquals(false, ins.match(reg, str));

        str = "ab";

        reg = ".*";
        assertEquals(true, ins.match(reg, str));

        str = "aaa";

        reg = ".*";
        assertEquals(true, ins.match(reg, str));

        reg = "aa*";
        assertEquals(true, ins.match(reg, str));

        reg = "aa.a";
        assertEquals(false, ins.match(reg, str));

        reg = "a.a";
        assertEquals(true, ins.match(reg, str));

        reg = ".a";
        assertEquals(false, ins.match(reg, str));

        reg = "a*a";
        assertEquals(true, ins.match(reg, str));

        reg = "ab*a*c*a";
        assertEquals(true, ins.match(reg, str));

        str = "aab";

        reg = "c*a*b";
        assertEquals(true, ins.match(reg, str));

        str = "aaca";
        reg = "ab*a*c*a";
        assertEquals(true, ins.match(reg, str));

        str = "aaba";
        reg = "ab*a*c*a";
        assertEquals(false, ins.match(reg, str));

        str = "bbbba";
        reg = ".*a*a";
        assertEquals(true, ins.match(reg, str));

        str = "bcbbabab";
        reg = ".*a*a";
        assertEquals(false, ins.match(reg, str));
    }


} 
