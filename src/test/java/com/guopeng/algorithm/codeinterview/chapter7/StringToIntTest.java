package com.guopeng.algorithm.codeinterview.chapter7;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * StringToInt Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 24, 2017</pre>
 */
public class StringToIntTest {
    static StringToInt ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new StringToInt();
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
    public void testStringToInt() throws Exception {
        assertEquals(10, ins.stringToInt("10"));
        assertEquals(-10, ins.stringToInt("-10"));
        assertEquals(10, ins.stringToInt("+10"));
        assertEquals(0, ins.stringToInt("0"));
        assertEquals(2147483647, ins.stringToInt(String.valueOf(Integer.MAX_VALUE)));
        assertEquals(-2147483648, ins.stringToInt(String.valueOf(Integer.MIN_VALUE)));

        expectedExc.expect(Exception.class);
        ins.stringToInt("2147483648");
        ins.stringToInt("-2147483649");
        ins.stringToInt("");
        ins.stringToInt("a");
        ins.stringToInt(null);
    }

    private String repeat(char a, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += a;
        }
        return result;
    }
} 
