package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * DicesProbability Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 21, 2017</pre>
 */
public class DicesProbabilityTest {
    static DicesProbability ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new DicesProbability();
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
    public void testDicesProbability() throws Exception {
        ins.dicesProbability(4);
    }


    @Test
    public void testIncreaseNumber() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = DicesProbability.getClass().getMethod("increaseNumber", int[][].class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

    @Test
    public void testSum() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = DicesProbability.getClass().getMethod("sum", int[].class, int.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
