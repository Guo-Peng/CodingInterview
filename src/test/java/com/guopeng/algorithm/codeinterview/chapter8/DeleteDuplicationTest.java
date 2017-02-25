package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * DeleteDuplication Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class DeleteDuplicationTest {
    static DeleteDuplication ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new DeleteDuplication();
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
    public void testDeleteDuplication() throws Exception {
        LinkedList list = new LinkedList();
        list.constructList(new int[]{1, 2, 3, 3, 4, 4, 5});

        list.head = ins.deleteDuplication(list.head);
        assertEquals("125", list.printList());

        list.constructList(new int[]{1});
        list.head = ins.deleteDuplication(list.head);
        assertEquals("1", list.printList());

        list.constructList(new int[]{1, 2});
        list.head = ins.deleteDuplication(list.head);
        assertEquals("12", list.printList());

        list.constructList(new int[]{1, 1, 2});
        list.head = ins.deleteDuplication(list.head);
        assertEquals("2", list.printList());

        list.constructList(new int[]{1, 1});
        list.head = ins.deleteDuplication(list.head);
        assertEquals("", list.printList());
    }


} 
