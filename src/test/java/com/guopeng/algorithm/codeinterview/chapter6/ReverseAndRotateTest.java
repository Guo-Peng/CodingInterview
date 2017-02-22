package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ReverseAndRotate Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 20, 2017</pre>
 */
public class ReverseAndRotateTest {
    static ReverseAndRotate ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ReverseAndRotate();
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
    public void testReverseWordInSentence() throws Exception {
        char[] sentence = "I am a student.".toCharArray();
        assertArrayEquals("student. a am I".toCharArray(), ins.reverseWordInSentence(sentence));

        sentence = "student.".toCharArray();
        assertArrayEquals("student.".toCharArray(), ins.reverseWordInSentence(sentence));

        sentence = "  ".toCharArray();
        assertArrayEquals("  ".toCharArray(), ins.reverseWordInSentence(sentence));

        sentence = "".toCharArray();
        assertArrayEquals("".toCharArray(), ins.reverseWordInSentence(sentence));

        assertNull(ins.reverseWordInSentence(null));
    }

    @Test
    public void testLeftRotateString() throws Exception {
        char[] sentence = "abcdefg".toCharArray();
        assertArrayEquals("cdefgab".toCharArray(), ins.leftRotateString(sentence, 2));

        sentence = "abcdefg".toCharArray();
        assertArrayEquals("abcdefg".toCharArray(), ins.leftRotateString(sentence, 0));

        sentence = "abcdefg".toCharArray();
        assertArrayEquals("bcdefga".toCharArray(), ins.leftRotateString(sentence, 1));

        sentence = "abcdefg".toCharArray();
        assertArrayEquals("gabcdef".toCharArray(), ins.leftRotateString(sentence, 6));

        sentence = "abcdefg".toCharArray();
        assertArrayEquals("abcdefg".toCharArray(), ins.leftRotateString(sentence, 7));

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.leftRotateString(sentence, 8);
    }

} 
