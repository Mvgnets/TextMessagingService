/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textmessaging;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static textmessaging.TextMessagingUI.messageList;

/**
 *
 * @author EchoY
 */
public class TextMessagingUITest {
    
    public TextMessagingUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TextMessagingUI.
     */
    @Test
    public void testMain() {
        System.out.println("Testing main");
        messageList = new LinkedList<Message>();
        messageList.addFirst(new Message("John Smith", "Hello!", "07/12/2018"));
        messageList.addFirst(new Message("Terry Vickers", "I have a new phone", "08/12/2018"));
        int expSize = 2;
        int size = messageList.size();
        assertEquals(expSize, size);
    }
    
}
