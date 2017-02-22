package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FindNotRepeatingChar Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 16, 2017</pre>
 */
public class FindNotRepeatingCharTest {
    static FindNotRepeatingChar ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindNotRepeatingChar();
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
    public void testFindNotRepeatingChar() throws Exception {
        String str = "abaccdeff";
        assertEquals('b', ins.findNotRepeatingChar(str));

        str = "abcdefghijk";
        assertEquals('a', ins.findNotRepeatingChar(str));

        str = "aaabbxxccdd";
        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.findNotRepeatingChar(str);

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.findNotRepeatingChar(null);
    }


} 
