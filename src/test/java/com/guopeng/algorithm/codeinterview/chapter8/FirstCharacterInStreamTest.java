package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FirstCharacterInStream Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class FirstCharacterInStreamTest {
    static FirstCharacterInStream ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FirstCharacterInStream();
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
    public void testFirstCharacterAppearingOnce() throws Exception {
        assertEquals('g', ins.firstCharacterAppearingOnce("g"));
        assertEquals('g', ins.firstCharacterAppearingOnce("go"));
        assertEquals('g', ins.firstCharacterAppearingOnce("goo"));
        assertEquals('l', ins.firstCharacterAppearingOnce("googl"));
        assertEquals('l', ins.firstCharacterAppearingOnce("google"));
    }


} 
