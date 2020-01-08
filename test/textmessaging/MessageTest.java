/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textmessaging;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EchoY
 */
public class MessageTest {
    
    public MessageTest() {
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
     * Test of getName method, of class Message.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        Message test = new Message("John Smith", "Hello!", "07/12/2018");
        String name = "John Smith";
        String expName = test.getName();
        assertEquals(expName, name);
    }

    /**
     * Test of getBody method, of class Message.
     */
    @Test
    public void testGetBody() {
        System.out.println("Testing getBody");
        Message test = new Message("John Smith", "Hello!", "07/12/2018");
        String body = "Hello!";
        String expBody = test.getBody();
        assertEquals(expBody, body);
    }

    /**
     * Test of getDate method, of class Message.
     */
    @Test
    public void testGetDate() {
        System.out.println("Testing getDate");
        Message test = new Message("John Smith", "Hello!", "07/12/2018");
        String date = "07/12/2018";
        String expDate = test.getDate();
        assertEquals(expDate, date);
    }

    
}
